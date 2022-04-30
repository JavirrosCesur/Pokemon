package pokemon.movimientos;

import Pokemon.src.pokemon.enumerados.Tipo;

public abstract class Movimiento {
    
    private int numHabilidad;
    private String nombreHabilidad;
    private Tipo tipoMovimiento;
    private int consumo;
    private float precision;

    public Movimiento(int numHabilidad, String nombreHabilidad, Tipo tipoMovimiento, int consumo, float precision){
        this.numHabilidad = numHabilidad;
        this.nombreHabilidad = nombreHabilidad;
        this.tipoMovimiento = tipoMovimiento;
        this.consumo = consumo;
        this.precision = precision;
    }
    
    public int getNumHabilidad() {
        return numHabilidad;
    }
    public String getNombreHabilidad() {
        return nombreHabilidad;
    }
    public Tipo getTipoMovimiento() {
        return tipoMovimiento;
    }
    public int getConsumo() {
        return consumo;
    }
    public float getPrecision() {
        return precision;
    }
}