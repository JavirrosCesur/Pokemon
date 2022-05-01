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
        this.vitalidadMaxima = this.vitalidadMaxima + this.subirVitalidad(nivel);
        this.estaminaMaxima = this.estaminaMaxima + this.subirEstamina(nivel);
        this.ataque = this.ataque + this.subirAtributos(nivel);
        this.defensa = this.defensa + this.subirAtributos(nivel);
        this.ataqueEspecial = this.ataqueEspecial + this.subirAtributos(nivel);
        this.defensaEspecial = this.defensaEspecial + this.subirAtributos(nivel);
        this.velocidad = this.velocidad + this.subirAtributos(nivel);
    }

    /* Método setNivel implementando los métodos anteriores comentados y dando un valor válido a la experiencia.
    Sólo se usará en Pokemon salvajes o de Entrenadores rivales... o para hacer trampa.*/
    public void setNivel(int nivel) {
        this.nivel = nivel;
        this.nivelarNivel(nivel);
        this.experiencia = ((this.nivel - 1) * 10) + 1;
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
        this.experiencia = this.experiencia + cantidadExperiencia;
        this.subirDeNivel();
    }

    /* Método subirDeNivel, aplicando los algoritmos necesarios para la subida de nivel tras ganar experiencia.
    A diferencia de setNivel y nivelarNivel, este método se usa para los POKEMON del jugador, para su desarrollo "normal"
    tras un combate o un entrenamiento. Incluye información para el jugador sobre los aumentos de estadísticas.*/
    public boolean subirDeNivel(){
        if(this.experiencia < (this.nivel * 10)){
            return false;
        }else{
            this.nivel++;
            int subida;
            System.out.println("¡Tu Pokémon ha subido de nivel!");

            subida = (int)(Math.random()*3+3);
            System.out.println("Vitalidad + " + subida);
            this.vitalidadMaxima = this.vitalidadMaxima + subida;

            subida = (int)(Math.random()*3+1);
            System.out.println("Estamina + " + subida);
            this.estaminaMaxima = this.estaminaMaxima + subida;

            subida = (int)(Math.random()*4+1);
            System.out.println("Ataque + " + subida);
            this.ataque = this.ataque + subida;

            subida = (int)(Math.random()*4+1);
            System.out.println("Defensa + " + subida);
            this.defensa = this.defensa + subida;

            subida = (int)(Math.random()*4+1);
            System.out.println("Ataque especial + " + subida);
            this.ataqueEspecial = this.ataqueEspecial + subida;

            subida = (int)(Math.random()*4+1);
            System.out.println("Defensa especial + " + subida);
            this.defensaEspecial = this.defensaEspecial + subida;

            subida = (int)(Math.random()*4+1);
            System.out.println("Velocidad + " + subida);
            this.velocidad = this.velocidad + subida;

            return true;
        }
    }

    // Método resultadoMovimientoAtaque para resolver habilidades de la clase MovimientoAtaque.
    public void resultadoMovimientoAtaque(MovimientoAtaque habilidad, Pokemon pokemon){

        if(habilidad.getTipoMovimiento() == Tipo.ACERO && pokemon.getTipo1() == Tipo.ACERO || pokemon.getTipo1() == Tipo.AGUA
        || pokemon.getTipo1() == Tipo.ELECTRICO || pokemon.getTipo1() == Tipo.FUEGO){
            // Es poco efectivo.

        }else if(habilidad.getTipoMovimiento() == Tipo.ACERO && pokemon.getTipo1() == Tipo.HADA || pokemon.getTipo1() == Tipo.HIELO
        || pokemon.getTipo1() == Tipo.ROCA){
            // Es muy efectivo.

        }else if(habilidad.getTipoMovimiento() == Tipo.AGUA && pokemon.getTipo1() == Tipo.AGUA || pokemon.getTipo1() == Tipo.DRAGON
        || pokemon.getTipo1() == Tipo.PLANTA){
            // Es poco efectivo.

        }else if(habilidad.getTipoMovimiento() == Tipo.AGUA && pokemon.getTipo1() == Tipo.FUEGO || pokemon.getTipo1() == Tipo.ROCA
        || pokemon.getTipo1() == Tipo.TIERRA){
            // Es muy efectivo.
            
        }else if(habilidad.getTipoMovimiento() == Tipo.BICHO && pokemon.getTipo1() == Tipo.ACERO || pokemon.getTipo1() == Tipo.FANTASMA
        || pokemon.getTipo1() == Tipo.FUEGO || pokemon.getTipo1() == Tipo.HADA || pokemon.getTipo1() == Tipo.LUCHA
        || pokemon.getTipo1() == Tipo.VENENO || pokemon.getTipo1() == Tipo.VOLADOR){
            // Es poco efectivo.
        
        }else if(habilidad.getTipoMovimiento() == Tipo.BICHO && pokemon.getTipo1() == Tipo.PLANTA || pokemon.getTipo1() == Tipo.PSIQUICO
        || pokemon.getTipo1() == Tipo.SINIESTRO){
            // Es muy efectivo.

        }else if(habilidad.getTipoMovimiento() == Tipo.DRAGON && pokemon.getTipo1() == Tipo.HADA){
            // NO HACE EFECTO.

        }else if(habilidad.getTipoMovimiento() == Tipo.DRAGON && pokemon.getTipo1() == Tipo.ACERO){
            // Es poco efectivo.

        }else if(habilidad.getTipoMovimiento() == Tipo.DRAGON && pokemon.getTipo1() == Tipo.DRAGON){
            // Es muy efectivo.

        }else if(habilidad.getTipoMovimiento() == Tipo.ELECTRICO && pokemon.getTipo1() == Tipo.TIERRA){
            // NO HACE EFECTO.

        }else if(habilidad.getTipoMovimiento() == Tipo.ELECTRICO && pokemon.getTipo1() == Tipo.DRAGON || pokemon.getTipo1() == Tipo.ELECTRICO
        || pokemon.getTipo1() == Tipo.PLANTA){
            // Es poco efectivo.

        }else if(habilidad.getTipoMovimiento() == Tipo.ELECTRICO && pokemon.getTipo1() == Tipo.AGUA || pokemon.getTipo1() == Tipo.VOLADOR){
            // Es muy efectivo.

        }else if(habilidad.getTipoMovimiento() == Tipo.FANTASMA && pokemon.getTipo1() == Tipo.NORMAL){
            // NO HACE EFECTO.

        }else if(habilidad.getTipoMovimiento() == Tipo.FANTASMA && pokemon.getTipo1() == Tipo.SINIESTRO){
            // Es poco efectivo.

        }else if(habilidad.getTipoMovimiento() == Tipo.FANTASMA && pokemon.getTipo1() == Tipo.FANTASMA
        || pokemon.getTipo1() == Tipo.PSIQUICO){
            // Es muy efectivo.

        }else if(habilidad.getTipoMovimiento() == Tipo.FUEGO && pokemon.getTipo1() == Tipo.AGUA || pokemon.getTipo1() == Tipo.DRAGON
        || pokemon.getTipo1() == Tipo.FUEGO || pokemon.getTipo1() == Tipo.ROCA){
            // Es poco efectivo.

        }else if(habilidad.getTipoMovimiento() == Tipo.FUEGO && pokemon.getTipo1() == Tipo.ACERO || pokemon.getTipo1() == Tipo.BICHO
        || pokemon.getTipo1() == Tipo.HIELO || pokemon.getTipo1() == Tipo.PLANTA){
            // Es muy efectivo.

        }else if(habilidad.getTipoMovimiento() == Tipo.HADA && pokemon.getTipo1() == Tipo.ACERO || pokemon.getTipo1() == Tipo.FUEGO
        || pokemon.getTipo1() == Tipo.VENENO){
            // Es poco efectivo.

        }else if(habilidad.getTipoMovimiento() == Tipo.HADA && pokemon.getTipo1() == Tipo.DRAGON || pokemon.getTipo1() == Tipo.LUCHA
        || pokemon.getTipo1() == Tipo.SINIESTRO){
            // Es muy efectivo.

        }else if(habilidad.getTipoMovimiento() == Tipo.HIELO && pokemon.getTipo1() == Tipo.ACERO || pokemon.getTipo1() == Tipo.AGUA
        || pokemon.getTipo1() == Tipo.FUEGO || pokemon.getTipo1() == Tipo.HIELO){
            // Es poco efectivo.

        }else if(habilidad.getTipoMovimiento() == Tipo.HIELO && pokemon.getTipo1() == Tipo.DRAGON || pokemon.getTipo1() == Tipo.PLANTA
        || pokemon.getTipo1() == Tipo.TIERRA || pokemon.getTipo1() == Tipo.VOLADOR){
            // Es muy efectivo.
            
        }else if(habilidad.getTipoMovimiento() == Tipo.LUCHA && pokemon.getTipo1() == Tipo.FANTASMA){
            // NO HACE EFECTO.

        }else if(habilidad.getTipoMovimiento() == Tipo.LUCHA && pokemon.getTipo1() == Tipo.BICHO || pokemon.getTipo1() == Tipo.HADA
        || pokemon.getTipo1() == Tipo.PSIQUICO || pokemon.getTipo1() == Tipo.VENENO || pokemon.getTipo1() == Tipo.VOLADOR){
            // Es poco efectivo.

        }else if(habilidad.getTipoMovimiento() == Tipo.LUCHA && pokemon.getTipo1() == Tipo.ACERO || pokemon.getTipo1() == Tipo.HIELO
        || pokemon.getTipo1() == Tipo.NORMAL || pokemon.getTipo1() == Tipo.ROCA || pokemon.getTipo1() == Tipo.SINIESTRO){
            // Es muy efectivo.

        }else if(habilidad.getTipoMovimiento() == Tipo.NORMAL && pokemon.getTipo1() == Tipo.FANTASMA){
            // NO HACE EFECTO.

        }else if(habilidad.getTipoMovimiento() == Tipo.NORMAL && pokemon.getTipo1() == Tipo.ACERO || pokemon.getTipo1() == Tipo.ROCA){
            // Es poco efectivo.

        }else if(habilidad.getTipoMovimiento() == Tipo.PLANTA && pokemon.getTipo1() == Tipo.ACERO || pokemon.getTipo1() == Tipo.BICHO
        || pokemon.getTipo1() == Tipo.DRAGON || pokemon.getTipo1() == Tipo.FUEGO || pokemon.getTipo1() == Tipo.PLANTA
        || pokemon.getTipo1() == Tipo.VENENO || pokemon.getTipo1() == Tipo.VOLADOR){
            // Es poco efectivo.

        }else if(habilidad.getTipoMovimiento() == Tipo.PLANTA && pokemon.getTipo1() == Tipo.AGUA || pokemon.getTipo1() == Tipo.ROCA
        || pokemon.getTipo1() == Tipo.TIERRA){
            // Es muy efectivo.

        }else if(habilidad.getTipoMovimiento() == Tipo.PSIQUICO && pokemon.getTipo1() == Tipo.SINIESTRO){
            // NO HACE EFECTO.

        }else if(habilidad.getTipoMovimiento() == Tipo.PSIQUICO && pokemon.getTipo1() == Tipo.ACERO || pokemon.getTipo1() == Tipo.PSIQUICO){
            // Es poco efectivo.

        }else if(habilidad.getTipoMovimiento() == Tipo.PSIQUICO && pokemon.getTipo1() == Tipo.LUCHA || pokemon.getTipo1() == Tipo.VENENO){
            // Es muy efectivo.

        }else if(habilidad.getTipoMovimiento() == Tipo.ROCA && pokemon.getTipo1() == Tipo.ACERO || pokemon.getTipo1() == Tipo.LUCHA
        || pokemon.getTipo1() == Tipo.TIERRA){
            // Es poco efectivo.

        }else if(habilidad.getTipoMovimiento() == Tipo.ROCA && pokemon.getTipo1() == Tipo.BICHO || pokemon.getTipo1() == Tipo.FUEGO
        || pokemon.getTipo1() == Tipo.HIELO || pokemon.getTipo1() == Tipo.VOLADOR){
            // Es muy efectivo.

        }else if(habilidad.getTipoMovimiento() == Tipo.SINIESTRO && pokemon.getTipo1() == Tipo.HADA || pokemon.getTipo1() == Tipo.LUCHA
        || pokemon.getTipo1() == Tipo.SINIESTRO){
            // Es poco efectivo.

        }else if(habilidad.getTipoMovimiento() == Tipo.SINIESTRO && pokemon.getTipo1() == Tipo.FANTASMA || pokemon.getTipo1() == Tipo.PSIQUICO){
            // Es muy efectivo.

        }else if(habilidad.getTipoMovimiento() == Tipo.TIERRA && pokemon.getTipo1() == Tipo.VOLADOR){
            // NO HACE EFECTO.

        }else if(habilidad.getTipoMovimiento() == Tipo.TIERRA && pokemon.getTipo1() == Tipo.BICHO || pokemon.getTipo1() == Tipo.PLANTA){
            // Es poco efectivo.

        }else if(habilidad.getTipoMovimiento() == Tipo.TIERRA && pokemon.getTipo1() == Tipo.ACERO || pokemon.getTipo1() == Tipo.ELECTRICO
        || pokemon.getTipo1() == Tipo.FUEGO || pokemon.getTipo1() == Tipo.ROCA || pokemon.getTipo1() == Tipo.VENENO){
            // Es muy efectivo.

        }else if(habilidad.getTipoMovimiento() == Tipo.VENENO && pokemon.getTipo1() == Tipo.ACERO){
            // NO HACE EFECTO.

        }else if(habilidad.getTipoMovimiento() == Tipo.VENENO && pokemon.getTipo1() == Tipo.FANTASMA || pokemon.getTipo1() == Tipo.ROCA
        || pokemon.getTipo1() == Tipo.TIERRA || pokemon.getTipo1() == Tipo.VENENO){
            // Es poco efectivo.

        }else if(habilidad.getTipoMovimiento() == Tipo.VENENO && pokemon.getTipo1() == Tipo.HADA || pokemon.getTipo1() == Tipo.PLANTA){
            // Es muy efectivo.

        }else if(habilidad.getTipoMovimiento() == Tipo.VOLADOR && pokemon.getTipo1() == Tipo.ACERO || pokemon.getTipo1() == Tipo.ELECTRICO
        || pokemon.getTipo1() == Tipo.ROCA){
            // Es poco efectivo.

        }else if(habilidad.getTipoMovimiento() == Tipo.VOLADOR && pokemon.getTipo1() == Tipo.BICHO || pokemon.getTipo1() == Tipo.LUCHA
        || pokemon.getTipo1() == Tipo.PLANTA){
            // Es muy efectivo.

        }else{
            // Normal.
        }
    }

    // Método resultadoMovimientoEstado para resolver habilidades de la clase MovimientoEstado.
    public boolean resultadoMovimientoEstado(MovimientoEstado habilidad, Pokemon pokemon){
        return false;
    }

    // Método resultadoMovimientoMejora para resolver habilidades de la clase MovimientoMejora.
    public void resultadoMovimientoMejora(MovimientoMejora habilidad, Pokemon pokemon){

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

            }
            return true;
        }
    }

    public void descansar(){
        this.vitalidadActual = this.vitalidadMaxima;
        this.estaminaActual = this.estaminaMaxima;
        System.out.println(this.mote + " está fresco como una rosa.");
    }

    public boolean aprenderMovimiento(Movimiento habilidad){
        return false;
    }
}