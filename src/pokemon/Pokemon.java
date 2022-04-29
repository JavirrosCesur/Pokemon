package pokemon;

public class Pokemon {

    private String nombre;
    private String mote;
    private int nivel;
    private int experiencia;
    private int vitalidad;
    private int estamina;
    private int ataque;
    private int defensa;
    private int ataqueEspecial;
    private int defensaEspecial;
    private int velocidad;
    private int fertilidad;
    private Tipo tipo1;
    private Tipo tipo2;
    private EstadoPrincipal estadoPrincipal;
    private EstadoSecundario estadoSecundario;
    private Mejora mejora1;
    private Mejora mejora2;
    private ArrayList<Movimiento> habilidades;

    public Pokemon(String nombre, String mote, int nivel, int experiencia, int vitalidad, int estamina, int ataque,
            int defensa,
            int ataqueEspecial, int defensaEspecial, int velocidad, Tipo tipo1, Tipo tipo2,
            ArrayList<Movimiento> habilidades) {
        this.nombre = nombre;
        this.mote = mote;
        this.nivel = nivel;
        this.experiencia = experiencia;
        this.vitalidad = vitalidad;
        this.estamina = estamina;
        this.ataque = ataque;
        this.defensa = defensa;
        this.ataqueEspecial = ataqueEspecial;
        this.defensaEspecial = defensaEspecial;
        this.velocidad = velocidad;
        this.fertilidad = 5;
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

    public int getVitalidad() {
        return vitalidad;
    }

    public int getEstamina() {
        return estamina;
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

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public void setVitalidad(int vitalidad) {
        this.vitalidad = vitalidad;
    }

    public void setEstamina(int estamina) {
        this.estamina = estamina;
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

}