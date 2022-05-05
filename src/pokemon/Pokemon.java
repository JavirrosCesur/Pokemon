package Pokemon.src.pokemon;

import java.util.ArrayList;
import Pokemon.src.pokemon.enumerados.*;
import Pokemon.src.pokemon.movimientos.*;

public class Pokemon {
    
    private String nombre;
    private String mote;
    private int nivel;
    private int experiencia;
    private int vitalidadMaxima;
    private int vitalidadActual;
    private int estaminaMaxima;
    private int estaminaActual;
    private int ataque;
    private int defensa;
    private int ataqueEspecial;
    private int defensaEspecial;
    private int velocidad;
    private int fertilidad;
    private Genero genero;
    private Tipo tipo1;
    private Tipo tipo2;
    private EstadoPrincipal estadoPrincipal;
    private EstadoSecundario estadoSecundario;
    private Mejora mejora1;
    private Mejora mejora2;
    private ArrayList<Movimiento> habilidades;

    public Pokemon(String nombre, String mote, int experiencia, int vitalidadMaxima, int estaminaMaxima, int ataque, int defensa, 
    int ataqueEspecial, int defensaEspecial, int velocidad, Genero genero, Tipo tipo1, Tipo tipo2, 
    ArrayList<Movimiento> habilidades){
        this.nombre = nombre;
        this.mote = mote;
        this.nivel = 1;
        this.experiencia = experiencia;
        this.vitalidadMaxima = vitalidadMaxima;
        this.vitalidadActual = vitalidadMaxima;
        this.estaminaMaxima = estaminaMaxima;
        this.estaminaActual = estaminaMaxima;
        this.ataque = ataque;
        this.defensa = defensa;
        this.ataqueEspecial = ataqueEspecial;
        this.defensaEspecial = defensaEspecial;
        this.velocidad = velocidad;
        this.fertilidad = 5;
        this.genero = genero;
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
        this.estadoPrincipal = EstadoPrincipal.NINGUNO;
        this.estadoSecundario = EstadoSecundario.NINGUNO;
        this.mejora1 = Mejora.NINGUNO;
        this.mejora2 = Mejora.NINGUNO;
        this.habilidades = new ArrayList<Movimiento>();
    }

    public String getNombre() {
        return nombre;
    }
    public String getMote() {
        return mote;
    }
    public int getNivel() {
        return nivel;
    }
    public int getExperiencia() {
        return experiencia;
    }
    public int getVitalidadMaxima() {
        return vitalidadMaxima;
    }
    public int getVitalidadActual() {
        return vitalidadActual;
    }
    public int getEstaminaMaxima() {
        return estaminaMaxima;
    }
    public int getEstaminaActual() {
        return estaminaActual;
    }
    public int getAtaque() {
        return ataque;
    }
    public int getDefensa() {
        return defensa;
    }
    public int getAtaqueEspecial() {
        return ataqueEspecial;
    }
    public int getDefensaEspecial() {
        return defensaEspecial;
    }
    public int getVelocidad() {
        return velocidad;
    }
    public int getFertilidad() {
        return fertilidad;
    }
    public Genero getGenero() {
        return genero;
    }
    public Tipo getTipo1() {
        return tipo1;
    }
    public Tipo getTipo2() {
        return tipo2;
    }
    public EstadoPrincipal getEstadoPrincipal() {
        return estadoPrincipal;
    }
    public EstadoSecundario getEstadoSecundario() {
        return estadoSecundario;
    }
    public Mejora getMejora1() {
        return mejora1;
    }
    public Mejora getMejora2() {
        return mejora2;
    }
    public ArrayList<Movimiento> getHabilidades() {
        return habilidades;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setMote(String mote) {
        this.mote = mote;
    }

    /* Métodos necesarios para subir a un POKEMON rival al nivel del nuestro, si es nivel 2 o superior, aumentando
    los valores de atributo aleatorios tantas veces como niveles tenga el POKEMON.*/
    public int subirVitalidad(int nivel){
        int sumaVitalidad = 0;
        for(int i = 2; i <= nivel; i++){
            sumaVitalidad+= (int)(Math.random()*3+3);
        }
        return sumaVitalidad;
    }
    public int subirEstamina(int nivel){
        int sumaEstamina = 0;
        for(int i = 2; i <= nivel; i++){
            sumaEstamina+= (int)(Math.random()*3+1);
        }
        return sumaEstamina;
    }
    public int subirAtributos(int nivel){
        int sumaAtributos = 0;
        for(int i = 2; i <= nivel; i++){
            sumaAtributos+= (int)(Math.random()*4+1);
        }
        return sumaAtributos;
    }
    // Método nivelarNivel, en el que introducimos los métodos anteriores, resultando los valores finales.
    public void nivelarNivel(int nivel){
        this.setVitalidadMaxima(this.vitalidadMaxima + this.subirVitalidad(nivel));
        this.setEstaminaMaxima(this.estaminaMaxima + this.subirEstamina(nivel));
        this.setAtaque(this.ataque + this.subirAtributos(nivel));
        this.setDefensa(this.defensa + this.subirAtributos(nivel));
        this.setAtaqueEspecial(this.ataqueEspecial + this.subirAtributos(nivel));
        this.setDefensaEspecial(this.defensaEspecial + this.subirAtributos(nivel));
        this.setVelocidad(this.velocidad + this.subirAtributos(nivel));
    }

    /* Método setNivel implementando los métodos anteriores comentados y dando un valor válido a la experiencia.
    Sólo se usará en Pokemon salvajes o de Entrenadores rivales... o para hacer trampa.*/
    public void setNivel(int nivel) {
        this.setNivel(nivel);;
        this.nivelarNivel(nivel);
        this.setExperiencia(((this.nivel - 1) * 10) + 1);
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
    public void setVitalidadMaxima(int vitalidadMaxima) {
        this.vitalidadMaxima = vitalidadMaxima;
    }
    public void setVitalidadActual(int vitalidadActual) {
        this.vitalidadActual = vitalidadActual;
    }
    public void setEstaminaMaxima(int estaminaMaxima) {
        this.estaminaMaxima = estaminaMaxima;
    }
    public void setEstaminaActual(int estaminaActual) {
        this.estaminaActual = estaminaActual;
    }
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }
    public void setAtaqueEspecial(int ataqueEspecial) {
        this.ataqueEspecial = ataqueEspecial;
    }
    public void setDefensaEspecial(int defensaEspecial) {
        this.defensaEspecial = defensaEspecial;
    }
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    public void setFertilidad(int fertilidad) {
        this.fertilidad = fertilidad;
    }
    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    public void setTipo1(Tipo tipo1) {
        this.tipo1 = tipo1;
    }
    public void setTipo2(Tipo tipo2) {
        this.tipo2 = tipo2;
    }
    public void setEstadoPrincipal(EstadoPrincipal estadoPrincipal) {
        this.estadoPrincipal = estadoPrincipal;
    }
    public void setEstadoSecundario(EstadoSecundario estadoSecundario) {
        this.estadoSecundario = estadoSecundario;
    }
    public void setMejora1(Mejora mejora1) {
        this.mejora1 = mejora1;
    }
    public void setMejora2(Mejora mejora2) {
        this.mejora2 = mejora2;
    }
    public void setHabilidades(ArrayList<Movimiento> habilidades) {
        this.habilidades = habilidades;
    }

    // Método ganarExperiencia para un uso adecuado de ésta. Implementa el método subirDeNivel, explicado abajo.
    public void ganarExperiencia(int cantidadExperiencia){
        this.setExperiencia(this.experiencia + cantidadExperiencia);
        this.subirDeNivel();
    }

    /* Método subirDeNivel, aplicando los algoritmos necesarios para la subida de nivel tras ganar experiencia.
    A diferencia de setNivel y nivelarNivel, este método se usa para los POKEMON del jugador, para su desarrollo "normal"
    tras un combate o un entrenamiento. Incluye información para el jugador sobre los aumentos de estadísticas.*/
    public boolean subirDeNivel(){
        if(this.experiencia < (this.nivel * 10)){
            return false;
        }else{
            System.out.println("¡Tu POKEMON ha subido de nivel!");
            this.nivel++;

            int subida;
            subida = (int)(Math.random()*3+3);
            System.out.println("Vitalidad + " + subida);
            this.setVitalidadMaxima(this.vitalidadMaxima + subida);

            subida = (int)(Math.random()*3+1);
            System.out.println("Estamina + " + subida);
            this.setEstaminaMaxima(this.estaminaMaxima + subida);

            subida = (int)(Math.random()*4+1);
            System.out.println("Ataque + " + subida);
            this.setAtaque(this.ataque + subida);

            subida = (int)(Math.random()*4+1);
            System.out.println("Defensa + " + subida);
            this.setDefensa(this.defensa + subida);

            subida = (int)(Math.random()*4+1);
            System.out.println("Ataque especial + " + subida);
            this.setAtaqueEspecial(this.ataqueEspecial + subida);

            subida = (int)(Math.random()*4+1);
            System.out.println("Defensa especial + " + subida);
            this.setDefensaEspecial(this.defensaEspecial + subida);

            subida = (int)(Math.random()*4+1);
            System.out.println("Velocidad + " + subida);
            this.setVelocidad(this.velocidad + subida);

            return true;
        }
    }

    // Método resultadoMovimientoAtaque para resolver habilidades de la clase MovimientoAtaque.
    public float resultadoMovimientoAtaque(MovimientoAtaque habilidad, Pokemon pokemon){
        float ventaja1;
        float ventaja2;

        if(habilidad.getTipoMovimiento() == Tipo.ACERO && pokemon.getTipo1() == Tipo.ACERO || pokemon.getTipo1() == Tipo.AGUA
        || pokemon.getTipo1() == Tipo.ELECTRICO || pokemon.getTipo1() == Tipo.FUEGO){
            // Es poco efectivo.
            ventaja1 = 0.5f;

        }else if(habilidad.getTipoMovimiento() == Tipo.ACERO && pokemon.getTipo1() == Tipo.HADA || pokemon.getTipo1() == Tipo.HIELO
        || pokemon.getTipo1() == Tipo.ROCA){
            // Es muy efectivo.
            ventaja1 = 2f;

        }else if(habilidad.getTipoMovimiento() == Tipo.AGUA && pokemon.getTipo1() == Tipo.AGUA || pokemon.getTipo1() == Tipo.DRAGON
        || pokemon.getTipo1() == Tipo.PLANTA){
            // Es poco efectivo.
            ventaja1 = 0.5f;

        }else if(habilidad.getTipoMovimiento() == Tipo.AGUA && pokemon.getTipo1() == Tipo.FUEGO || pokemon.getTipo1() == Tipo.ROCA
        || pokemon.getTipo1() == Tipo.TIERRA){
            // Es muy efectivo.
            ventaja1 = 2f;
            
        }else if(habilidad.getTipoMovimiento() == Tipo.BICHO && pokemon.getTipo1() == Tipo.ACERO
        || pokemon.getTipo1() == Tipo.FANTASMA || pokemon.getTipo1() == Tipo.FUEGO || pokemon.getTipo1() == Tipo.HADA
        || pokemon.getTipo1() == Tipo.LUCHA || pokemon.getTipo1() == Tipo.VENENO || pokemon.getTipo1() == Tipo.VOLADOR){
            // Es poco efectivo.
            ventaja1 = 0.5f;
        
        }else if(habilidad.getTipoMovimiento() == Tipo.BICHO && pokemon.getTipo1() == Tipo.PLANTA
        || pokemon.getTipo1() == Tipo.PSIQUICO || pokemon.getTipo1() == Tipo.SINIESTRO){
            // Es muy efectivo.
            ventaja1 = 2f;

        }else if(habilidad.getTipoMovimiento() == Tipo.DRAGON && pokemon.getTipo1() == Tipo.HADA){
            // NO HACE EFECTO.
            ventaja1 = 0f;

        }else if(habilidad.getTipoMovimiento() == Tipo.DRAGON && pokemon.getTipo1() == Tipo.ACERO){
            // Es poco efectivo.
            ventaja1 = 0.5f;

        }else if(habilidad.getTipoMovimiento() == Tipo.DRAGON && pokemon.getTipo1() == Tipo.DRAGON){
            // Es muy efectivo.
            ventaja1 = 2f;

        }else if(habilidad.getTipoMovimiento() == Tipo.ELECTRICO && pokemon.getTipo1() == Tipo.TIERRA){
            // NO HACE EFECTO.
            ventaja1 = 0f;

        }else if(habilidad.getTipoMovimiento() == Tipo.ELECTRICO && pokemon.getTipo1() == Tipo.DRAGON
        || pokemon.getTipo1() == Tipo.ELECTRICO || pokemon.getTipo1() == Tipo.PLANTA){
            // Es poco efectivo.
            ventaja1 = 0.5f;

        }else if(habilidad.getTipoMovimiento() == Tipo.ELECTRICO && pokemon.getTipo1() == Tipo.AGUA
        || pokemon.getTipo1() == Tipo.VOLADOR){
            // Es muy efectivo.
            ventaja1 = 2f;

        }else if(habilidad.getTipoMovimiento() == Tipo.FANTASMA && pokemon.getTipo1() == Tipo.NORMAL){
            // NO HACE EFECTO.
            ventaja1 = 0f;

        }else if(habilidad.getTipoMovimiento() == Tipo.FANTASMA && pokemon.getTipo1() == Tipo.SINIESTRO){
            // Es poco efectivo.
            ventaja1 = 0.5f;

        }else if(habilidad.getTipoMovimiento() == Tipo.FANTASMA && pokemon.getTipo1() == Tipo.FANTASMA
        || pokemon.getTipo1() == Tipo.PSIQUICO){
            // Es muy efectivo.
            ventaja1 = 2f;

        }else if(habilidad.getTipoMovimiento() == Tipo.FUEGO && pokemon.getTipo1() == Tipo.AGUA
        || pokemon.getTipo1() == Tipo.DRAGON || pokemon.getTipo1() == Tipo.FUEGO || pokemon.getTipo1() == Tipo.ROCA){
            // Es poco efectivo.
            ventaja1 = 0.5f;

        }else if(habilidad.getTipoMovimiento() == Tipo.FUEGO && pokemon.getTipo1() == Tipo.ACERO
        || pokemon.getTipo1() == Tipo.BICHO || pokemon.getTipo1() == Tipo.HIELO || pokemon.getTipo1() == Tipo.PLANTA){
            // Es muy efectivo.
            ventaja1 = 2f;

        }else if(habilidad.getTipoMovimiento() == Tipo.HADA && pokemon.getTipo1() == Tipo.ACERO
        || pokemon.getTipo1() == Tipo.FUEGO || pokemon.getTipo1() == Tipo.VENENO){
            // Es poco efectivo.
            ventaja1 = 0.5f;

        }else if(habilidad.getTipoMovimiento() == Tipo.HADA && pokemon.getTipo1() == Tipo.DRAGON
        || pokemon.getTipo1() == Tipo.LUCHA || pokemon.getTipo1() == Tipo.SINIESTRO){
            // Es muy efectivo.
            ventaja1 = 2f;

        }else if(habilidad.getTipoMovimiento() == Tipo.HIELO && pokemon.getTipo1() == Tipo.ACERO
        || pokemon.getTipo1() == Tipo.AGUA || pokemon.getTipo1() == Tipo.FUEGO || pokemon.getTipo1() == Tipo.HIELO){
            // Es poco efectivo.
            ventaja1 = 0.5f;

        }else if(habilidad.getTipoMovimiento() == Tipo.HIELO && pokemon.getTipo1() == Tipo.DRAGON
        || pokemon.getTipo1() == Tipo.PLANTA || pokemon.getTipo1() == Tipo.TIERRA || pokemon.getTipo1() == Tipo.VOLADOR){
            // Es muy efectivo.
            ventaja1 = 2f;
            
        }else if(habilidad.getTipoMovimiento() == Tipo.LUCHA && pokemon.getTipo1() == Tipo.FANTASMA){
            // NO HACE EFECTO.
            ventaja1 = 0f;

        }else if(habilidad.getTipoMovimiento() == Tipo.LUCHA && pokemon.getTipo1() == Tipo.BICHO
        || pokemon.getTipo1() == Tipo.HADA || pokemon.getTipo1() == Tipo.PSIQUICO || pokemon.getTipo1() == Tipo.VENENO
        || pokemon.getTipo1() == Tipo.VOLADOR){
            // Es poco efectivo.
            ventaja1 = 0.5f;

        }else if(habilidad.getTipoMovimiento() == Tipo.LUCHA && pokemon.getTipo1() == Tipo.ACERO
        || pokemon.getTipo1() == Tipo.HIELO || pokemon.getTipo1() == Tipo.NORMAL || pokemon.getTipo1() == Tipo.ROCA
        || pokemon.getTipo1() == Tipo.SINIESTRO){
            // Es muy efectivo.
            ventaja1 = 2f;

        }else if(habilidad.getTipoMovimiento() == Tipo.NORMAL && pokemon.getTipo1() == Tipo.FANTASMA){
            // NO HACE EFECTO.
            ventaja1 = 0f;

        }else if(habilidad.getTipoMovimiento() == Tipo.NORMAL && pokemon.getTipo1() == Tipo.ACERO
        || pokemon.getTipo1() == Tipo.ROCA){
            // Es poco efectivo.
            ventaja1 = 0.5f;

        }else if(habilidad.getTipoMovimiento() == Tipo.PLANTA && pokemon.getTipo1() == Tipo.ACERO
        || pokemon.getTipo1() == Tipo.BICHO || pokemon.getTipo1() == Tipo.DRAGON || pokemon.getTipo1() == Tipo.FUEGO
        || pokemon.getTipo1() == Tipo.PLANTA || pokemon.getTipo1() == Tipo.VENENO || pokemon.getTipo1() == Tipo.VOLADOR){
            // Es poco efectivo.
            ventaja1 = 0.5f;

        }else if(habilidad.getTipoMovimiento() == Tipo.PLANTA && pokemon.getTipo1() == Tipo.AGUA
        || pokemon.getTipo1() == Tipo.ROCA || pokemon.getTipo1() == Tipo.TIERRA){
            // Es muy efectivo.
            ventaja1 = 2f;

        }else if(habilidad.getTipoMovimiento() == Tipo.PSIQUICO && pokemon.getTipo1() == Tipo.SINIESTRO){
            // NO HACE EFECTO.
            ventaja1 = 0f;

        }else if(habilidad.getTipoMovimiento() == Tipo.PSIQUICO && pokemon.getTipo1() == Tipo.ACERO
        || pokemon.getTipo1() == Tipo.PSIQUICO){
            // Es poco efectivo.
            ventaja1 = 0.5f;

        }else if(habilidad.getTipoMovimiento() == Tipo.PSIQUICO && pokemon.getTipo1() == Tipo.LUCHA
        || pokemon.getTipo1() == Tipo.VENENO){
            // Es muy efectivo.
            ventaja1 = 2f;

        }else if(habilidad.getTipoMovimiento() == Tipo.ROCA && pokemon.getTipo1() == Tipo.ACERO || pokemon.getTipo1() == Tipo.LUCHA
        || pokemon.getTipo1() == Tipo.TIERRA){
            // Es poco efectivo.
            ventaja1 = 0.5f;

        }else if(habilidad.getTipoMovimiento() == Tipo.ROCA && pokemon.getTipo1() == Tipo.BICHO || pokemon.getTipo1() == Tipo.FUEGO
        || pokemon.getTipo1() == Tipo.HIELO || pokemon.getTipo1() == Tipo.VOLADOR){
            // Es muy efectivo.
            ventaja1 = 2f;

        }else if(habilidad.getTipoMovimiento() == Tipo.SINIESTRO && pokemon.getTipo1() == Tipo.HADA
        || pokemon.getTipo1() == Tipo.LUCHA || pokemon.getTipo1() == Tipo.SINIESTRO){
            // Es poco efectivo.
            ventaja1 = 0.5f;

        }else if(habilidad.getTipoMovimiento() == Tipo.SINIESTRO && pokemon.getTipo1() == Tipo.FANTASMA
        || pokemon.getTipo1() == Tipo.PSIQUICO){
            // Es muy efectivo.
            ventaja1 = 2f;

        }else if(habilidad.getTipoMovimiento() == Tipo.TIERRA && pokemon.getTipo1() == Tipo.VOLADOR){
            // NO HACE EFECTO.
            ventaja1 = 0f;

        }else if(habilidad.getTipoMovimiento() == Tipo.TIERRA && pokemon.getTipo1() == Tipo.BICHO
        || pokemon.getTipo1() == Tipo.PLANTA){
            // Es poco efectivo.
            ventaja1 = 0.5f;

        }else if(habilidad.getTipoMovimiento() == Tipo.TIERRA && pokemon.getTipo1() == Tipo.ACERO
        || pokemon.getTipo1() == Tipo.ELECTRICO || pokemon.getTipo1() == Tipo.FUEGO || pokemon.getTipo1() == Tipo.ROCA
        || pokemon.getTipo1() == Tipo.VENENO){
            // Es muy efectivo.
            ventaja1 = 2f;

        }else if(habilidad.getTipoMovimiento() == Tipo.VENENO && pokemon.getTipo1() == Tipo.ACERO){
            // NO HACE EFECTO.
            ventaja1 = 0f;

        }else if(habilidad.getTipoMovimiento() == Tipo.VENENO && pokemon.getTipo1() == Tipo.FANTASMA
        || pokemon.getTipo1() == Tipo.ROCA || pokemon.getTipo1() == Tipo.TIERRA || pokemon.getTipo1() == Tipo.VENENO){
            // Es poco efectivo.
            ventaja1 = 0.5f;

        }else if(habilidad.getTipoMovimiento() == Tipo.VENENO && pokemon.getTipo1() == Tipo.HADA
        || pokemon.getTipo1() == Tipo.PLANTA){
            // Es muy efectivo.
            ventaja1 = 2f;

        }else if(habilidad.getTipoMovimiento() == Tipo.VOLADOR && pokemon.getTipo1() == Tipo.ACERO
        || pokemon.getTipo1() == Tipo.ELECTRICO || pokemon.getTipo1() == Tipo.ROCA){
            // Es poco efectivo.
            ventaja1 = 0.5f;

        }else if(habilidad.getTipoMovimiento() == Tipo.VOLADOR && pokemon.getTipo1() == Tipo.BICHO
        || pokemon.getTipo1() == Tipo.LUCHA || pokemon.getTipo1() == Tipo.PLANTA){
            // Es muy efectivo.
            ventaja1 = 2f;

        }else{
            // Normal.
            ventaja1 = 1f;
        }

        if(habilidad.getTipoMovimiento() == Tipo.ACERO && pokemon.getTipo2() == Tipo.ACERO || pokemon.getTipo2() == Tipo.AGUA
        || pokemon.getTipo2() == Tipo.ELECTRICO || pokemon.getTipo2() == Tipo.FUEGO){
            // Es poco efectivo.
            ventaja2 = 0.5f;

        }else if(habilidad.getTipoMovimiento() == Tipo.ACERO && pokemon.getTipo2() == Tipo.HADA || pokemon.getTipo2() == Tipo.HIELO
        || pokemon.getTipo2() == Tipo.ROCA){
            // Es muy efectivo.
            ventaja2 = 2f;

        }else if(habilidad.getTipoMovimiento() == Tipo.AGUA && pokemon.getTipo2() == Tipo.AGUA || pokemon.getTipo2() == Tipo.DRAGON
        || pokemon.getTipo2() == Tipo.PLANTA){
            // Es poco efectivo.
            ventaja2 = 0.5f;

        }else if(habilidad.getTipoMovimiento() == Tipo.AGUA && pokemon.getTipo2() == Tipo.FUEGO || pokemon.getTipo2() == Tipo.ROCA
        || pokemon.getTipo2() == Tipo.TIERRA){
            // Es muy efectivo.
            ventaja2 = 2f;
            
        }else if(habilidad.getTipoMovimiento() == Tipo.BICHO && pokemon.getTipo2() == Tipo.ACERO
        || pokemon.getTipo2() == Tipo.FANTASMA || pokemon.getTipo2() == Tipo.FUEGO || pokemon.getTipo2() == Tipo.HADA
        || pokemon.getTipo2() == Tipo.LUCHA || pokemon.getTipo2() == Tipo.VENENO || pokemon.getTipo2() == Tipo.VOLADOR){
            // Es poco efectivo.
            ventaja2 = 0.5f;
        
        }else if(habilidad.getTipoMovimiento() == Tipo.BICHO && pokemon.getTipo2() == Tipo.PLANTA
        || pokemon.getTipo2() == Tipo.PSIQUICO || pokemon.getTipo2() == Tipo.SINIESTRO){
            // Es muy efectivo.
            ventaja2 = 2f;

        }else if(habilidad.getTipoMovimiento() == Tipo.DRAGON && pokemon.getTipo2() == Tipo.HADA){
            // NO HACE EFECTO.
            ventaja2 = 0f;

        }else if(habilidad.getTipoMovimiento() == Tipo.DRAGON && pokemon.getTipo2() == Tipo.ACERO){
            // Es poco efectivo.
            ventaja2 = 0.5f;

        }else if(habilidad.getTipoMovimiento() == Tipo.DRAGON && pokemon.getTipo2() == Tipo.DRAGON){
            // Es muy efectivo.
            ventaja2 = 2f;

        }else if(habilidad.getTipoMovimiento() == Tipo.ELECTRICO && pokemon.getTipo2() == Tipo.TIERRA){
            // NO HACE EFECTO.
            ventaja2 = 0f;

        }else if(habilidad.getTipoMovimiento() == Tipo.ELECTRICO && pokemon.getTipo2() == Tipo.DRAGON
        || pokemon.getTipo2() == Tipo.ELECTRICO || pokemon.getTipo2() == Tipo.PLANTA){
            // Es poco efectivo.
            ventaja2 = 0.5f;

        }else if(habilidad.getTipoMovimiento() == Tipo.ELECTRICO && pokemon.getTipo2() == Tipo.AGUA
        || pokemon.getTipo2() == Tipo.VOLADOR){
            // Es muy efectivo.
            ventaja2 = 2f;

        }else if(habilidad.getTipoMovimiento() == Tipo.FANTASMA && pokemon.getTipo2() == Tipo.NORMAL){
            // NO HACE EFECTO.
            ventaja2 = 0f;

        }else if(habilidad.getTipoMovimiento() == Tipo.FANTASMA && pokemon.getTipo2() == Tipo.SINIESTRO){
            // Es poco efectivo.
            ventaja2 = 0.5f;

        }else if(habilidad.getTipoMovimiento() == Tipo.FANTASMA && pokemon.getTipo2() == Tipo.FANTASMA
        || pokemon.getTipo2() == Tipo.PSIQUICO){
            // Es muy efectivo.
            ventaja2 = 2f;

        }else if(habilidad.getTipoMovimiento() == Tipo.FUEGO && pokemon.getTipo2() == Tipo.AGUA
        || pokemon.getTipo2() == Tipo.DRAGON || pokemon.getTipo2() == Tipo.FUEGO || pokemon.getTipo2() == Tipo.ROCA){
            // Es poco efectivo.
            ventaja2 = 0.5f;

        }else if(habilidad.getTipoMovimiento() == Tipo.FUEGO && pokemon.getTipo2() == Tipo.ACERO
        || pokemon.getTipo2() == Tipo.BICHO || pokemon.getTipo2() == Tipo.HIELO || pokemon.getTipo2() == Tipo.PLANTA){
            // Es muy efectivo.
            ventaja2 = 2f;

        }else if(habilidad.getTipoMovimiento() == Tipo.HADA && pokemon.getTipo2() == Tipo.ACERO
        || pokemon.getTipo2() == Tipo.FUEGO || pokemon.getTipo2() == Tipo.VENENO){
            // Es poco efectivo.
            ventaja2 = 0.5f;

        }else if(habilidad.getTipoMovimiento() == Tipo.HADA && pokemon.getTipo2() == Tipo.DRAGON
        || pokemon.getTipo2() == Tipo.LUCHA || pokemon.getTipo2() == Tipo.SINIESTRO){
            // Es muy efectivo.
            ventaja2 = 2f;

        }else if(habilidad.getTipoMovimiento() == Tipo.HIELO && pokemon.getTipo2() == Tipo.ACERO
        || pokemon.getTipo2() == Tipo.AGUA || pokemon.getTipo2() == Tipo.FUEGO || pokemon.getTipo2() == Tipo.HIELO){
            // Es poco efectivo.
            ventaja2 = 0.5f;

        }else if(habilidad.getTipoMovimiento() == Tipo.HIELO && pokemon.getTipo2() == Tipo.DRAGON
        || pokemon.getTipo2() == Tipo.PLANTA || pokemon.getTipo2() == Tipo.TIERRA || pokemon.getTipo2() == Tipo.VOLADOR){
            // Es muy efectivo.
            ventaja2 = 2f;
            
        }else if(habilidad.getTipoMovimiento() == Tipo.LUCHA && pokemon.getTipo2() == Tipo.FANTASMA){
            // NO HACE EFECTO.
            ventaja2 = 0f;

        }else if(habilidad.getTipoMovimiento() == Tipo.LUCHA && pokemon.getTipo2() == Tipo.BICHO
        || pokemon.getTipo2() == Tipo.HADA || pokemon.getTipo2() == Tipo.PSIQUICO || pokemon.getTipo2() == Tipo.VENENO
        || pokemon.getTipo2() == Tipo.VOLADOR){
            // Es poco efectivo.
            ventaja2 = 0.5f;

        }else if(habilidad.getTipoMovimiento() == Tipo.LUCHA && pokemon.getTipo2() == Tipo.ACERO
        || pokemon.getTipo2() == Tipo.HIELO || pokemon.getTipo2() == Tipo.NORMAL || pokemon.getTipo2() == Tipo.ROCA
        || pokemon.getTipo2() == Tipo.SINIESTRO){
            // Es muy efectivo.
            ventaja2 = 2f;

        }else if(habilidad.getTipoMovimiento() == Tipo.NORMAL && pokemon.getTipo2() == Tipo.FANTASMA){
            // NO HACE EFECTO.
            ventaja2 = 0f;

        }else if(habilidad.getTipoMovimiento() == Tipo.NORMAL && pokemon.getTipo2() == Tipo.ACERO
        || pokemon.getTipo2() == Tipo.ROCA){
            // Es poco efectivo.
            ventaja2 = 0.5f;

        }else if(habilidad.getTipoMovimiento() == Tipo.PLANTA && pokemon.getTipo2() == Tipo.ACERO
        || pokemon.getTipo2() == Tipo.BICHO || pokemon.getTipo2() == Tipo.DRAGON || pokemon.getTipo2() == Tipo.FUEGO
        || pokemon.getTipo2() == Tipo.PLANTA || pokemon.getTipo2() == Tipo.VENENO || pokemon.getTipo2() == Tipo.VOLADOR){
            // Es poco efectivo.
            ventaja2 = 0.5f;

        }else if(habilidad.getTipoMovimiento() == Tipo.PLANTA && pokemon.getTipo2() == Tipo.AGUA
        || pokemon.getTipo2() == Tipo.ROCA || pokemon.getTipo2() == Tipo.TIERRA){
            // Es muy efectivo.
            ventaja2 = 2f;

        }else if(habilidad.getTipoMovimiento() == Tipo.PSIQUICO && pokemon.getTipo2() == Tipo.SINIESTRO){
            // NO HACE EFECTO.
            ventaja2 = 0f;

        }else if(habilidad.getTipoMovimiento() == Tipo.PSIQUICO && pokemon.getTipo2() == Tipo.ACERO
        || pokemon.getTipo2() == Tipo.PSIQUICO){
            // Es poco efectivo.
            ventaja2 = 0.5f;

        }else if(habilidad.getTipoMovimiento() == Tipo.PSIQUICO && pokemon.getTipo2() == Tipo.LUCHA
        || pokemon.getTipo2() == Tipo.VENENO){
            // Es muy efectivo.
            ventaja2 = 2f;

        }else if(habilidad.getTipoMovimiento() == Tipo.ROCA && pokemon.getTipo2() == Tipo.ACERO || pokemon.getTipo2() == Tipo.LUCHA
        || pokemon.getTipo2() == Tipo.TIERRA){
            // Es poco efectivo.
            ventaja2 = 0.5f;

        }else if(habilidad.getTipoMovimiento() == Tipo.ROCA && pokemon.getTipo2() == Tipo.BICHO || pokemon.getTipo2() == Tipo.FUEGO
        || pokemon.getTipo2() == Tipo.HIELO || pokemon.getTipo2() == Tipo.VOLADOR){
            // Es muy efectivo.
            ventaja2 = 2f;

        }else if(habilidad.getTipoMovimiento() == Tipo.SINIESTRO && pokemon.getTipo2() == Tipo.HADA
        || pokemon.getTipo2() == Tipo.LUCHA || pokemon.getTipo2() == Tipo.SINIESTRO){
            // Es poco efectivo.
            ventaja2 = 0.5f;

        }else if(habilidad.getTipoMovimiento() == Tipo.SINIESTRO && pokemon.getTipo2() == Tipo.FANTASMA
        || pokemon.getTipo2() == Tipo.PSIQUICO){
            // Es muy efectivo.
            ventaja2 = 2f;

        }else if(habilidad.getTipoMovimiento() == Tipo.TIERRA && pokemon.getTipo2() == Tipo.VOLADOR){
            // NO HACE EFECTO.
            ventaja2 = 0f;

        }else if(habilidad.getTipoMovimiento() == Tipo.TIERRA && pokemon.getTipo2() == Tipo.BICHO
        || pokemon.getTipo2() == Tipo.PLANTA){
            // Es poco efectivo.
            ventaja2 = 0.5f;

        }else if(habilidad.getTipoMovimiento() == Tipo.TIERRA && pokemon.getTipo2() == Tipo.ACERO
        || pokemon.getTipo2() == Tipo.ELECTRICO || pokemon.getTipo2() == Tipo.FUEGO || pokemon.getTipo2() == Tipo.ROCA
        || pokemon.getTipo2() == Tipo.VENENO){
            // Es muy efectivo.
            ventaja2 = 2f;

        }else if(habilidad.getTipoMovimiento() == Tipo.VENENO && pokemon.getTipo2() == Tipo.ACERO){
            // NO HACE EFECTO.
            ventaja2 = 0f;

        }else if(habilidad.getTipoMovimiento() == Tipo.VENENO && pokemon.getTipo2() == Tipo.FANTASMA
        || pokemon.getTipo2() == Tipo.ROCA || pokemon.getTipo2() == Tipo.TIERRA || pokemon.getTipo2() == Tipo.VENENO){
            // Es poco efectivo.
            ventaja2 = 0.5f;

        }else if(habilidad.getTipoMovimiento() == Tipo.VENENO && pokemon.getTipo2() == Tipo.HADA
        || pokemon.getTipo2() == Tipo.PLANTA){
            // Es muy efectivo.
            ventaja2 = 2f;

        }else if(habilidad.getTipoMovimiento() == Tipo.VOLADOR && pokemon.getTipo2() == Tipo.ACERO
        || pokemon.getTipo2() == Tipo.ELECTRICO || pokemon.getTipo2() == Tipo.ROCA){
            // Es poco efectivo.
            ventaja2 = 0.5f;

        }else if(habilidad.getTipoMovimiento() == Tipo.VOLADOR && pokemon.getTipo2() == Tipo.BICHO
        || pokemon.getTipo2() == Tipo.LUCHA || pokemon.getTipo2() == Tipo.PLANTA){
            // Es muy efectivo.
            ventaja2 = 2f;

        }else{
            // Normal.
            ventaja2 = 1f;
        }

        return ventaja1 * ventaja2;
    }

    // Método resultadoMovimientoEstado para resolver habilidades de la clase MovimientoEstado.
    public void resultadoMovimientoEstado(MovimientoEstado habilidad, Pokemon pokemon){
        if(habilidad.getEstadoPrincipal() == EstadoPrincipal.CONGELADO && pokemon.getTipo1() == Tipo.HIELO
        || pokemon.getTipo2() == Tipo.HIELO){
            // No afecta.

        }else if(habilidad.getEstadoPrincipal() == EstadoPrincipal.ENVENENADO && pokemon.getTipo1() == Tipo.VENENO
        || pokemon.getTipo2() == Tipo.VENENO || pokemon.getTipo1() == Tipo.ACERO || pokemon.getTipo2() == Tipo.ACERO){
            // No afecta.

        }else if(habilidad.getEstadoPrincipal() == EstadoPrincipal.PARALIZADO && pokemon.getTipo1() == Tipo.ELECTRICO
        || pokemon.getTipo2() == Tipo.ELECTRICO){
            // No afecta.

        }else if(habilidad.getEstadoPrincipal() == EstadoPrincipal.QUEMADO && pokemon.getTipo1() == Tipo.FUEGO
        || pokemon.getTipo2() == Tipo.FUEGO){
            // No afecta.

        }else if(habilidad.getEstadoSecundario() == EstadoSecundario.ENAMORADO && (this.getGenero().equals(pokemon.getGenero()))
        && this.getNombre().equals(pokemon.getNombre())){
            // No afecta.

        }else{
            pokemon.setEstadoPrincipal(habilidad.getEstadoPrincipal());
            pokemon.setEstadoSecundario(habilidad.getEstadoSecundario());
        }
    }

    // Método resultadoMovimientoMejora para resolver habilidades de la clase MovimientoMejora.
    public void resultadoMovimientoMejora(MovimientoMejora habilidad){
        if(habilidad.getBuff() == Mejora.ATAQUE_FISICO){
            // Sube ataque - x contadorTurno.

        }else if(habilidad.getBuff() == Mejora.ATAQUE_ESPECIAL){
            // Sube ataqueEspecial - x contadorTurno.

        }else if(habilidad.getBuff() == Mejora.DEFENSA_FISICA){
            // Sube defensa - x contadorTurno.

        }else if(habilidad.getBuff() == Mejora.DEFENSA_ESPECIAL){
            // Sube defensaEspecial - x contadorTurno.

        }else if(habilidad.getBuff() == Mejora.VELOCIDAD){
            // Sube velocidad - x contadorTurno.
        }
    }

    // El método usarMovimiento utiliza "instanceof" para actuar en consecuencia con el tipo de Movimiento usado.
    public boolean usarMovimiento(int numHab, Pokemon pokemon){
        if(this.estaminaActual < this.habilidades.get(numHab).getConsumo()){
            return false;
        }else{
            System.out.println(this.getMote() + " usó " + this.habilidades.get(numHab).getNombreHabilidad() + "...");

            if(this.habilidades.get(numHab) instanceof MovimientoAtaque){
                this.resultadoMovimientoAtaque((MovimientoAtaque) this.habilidades.get(numHab), pokemon);

            }else if(this.habilidades.get(numHab) instanceof MovimientoEstado){
                this.resultadoMovimientoEstado((MovimientoEstado) this.habilidades.get(numHab), pokemon);

            }else if(this.habilidades.get(numHab) instanceof MovimientoMejora){
                this.resultadoMovimientoMejora((MovimientoMejora) this.habilidades.get(numHab));

            }
            return true;
        }
    }

    public void descansar(){
        this.setVitalidadActual(this.vitalidadMaxima);
        this.setEstaminaActual(this.estaminaMaxima);
        System.out.println(this.mote + " está fresco como una rosa.");
    }

    public boolean aprenderMovimiento(Movimiento habilidad){
        if(this.habilidades.size() > 3){
            System.out.println(this.getMote() + " debe olvidar un Movimiento para aprender " + habilidad.getNombreHabilidad());
            // Olvidar y aprender.
            
        }else{
            this.habilidades.add(habilidad);
            System.out.println(this.getMote() + " aprendió " + habilidad.getNombreHabilidad());
        }
        return false;
    }
}