package Pokemon.src.movimientos;

public abstract class Movimiento {
    
    private int numHabilidad;
    private String nombreHabilidad;

    public Movimiento(int numHabilidad, String nombreHabilidad){
        this.nombreHabilidad = nombreHabilidad;
    }
    
    public int getNumHabilidad() {
        return numHabilidad;
    }
    public String getNombreHabilidad() {
        return nombreHabilidad;
    }
}