package Pokemon.src.movimientos;

import Pokemon.src.enumerados.Tipo;

public class MovimientoAtaque extends Movimiento {

    private int potencia;
    private Tipo tipoMovimiento;

    public MovimientoAtaque(int numHabilidad, String nombreHabilidad, int potencia, Tipo tipoMovimiento) {
        super(numHabilidad, nombreHabilidad);
        this.potencia = potencia;
        this.tipoMovimiento = tipoMovimiento;
    }

    public int getPotencia() {
        return potencia;
    }
    public Tipo getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    public void setTipoMovimiento(Tipo tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }
}