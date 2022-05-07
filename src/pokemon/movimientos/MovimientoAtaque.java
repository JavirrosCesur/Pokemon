package Pokemon.src.pokemon.movimientos;

import Pokemon.src.pokemon.enumerados.Tipo;

public class MovimientoAtaque extends Movimiento {

    int potencia;
    Tipo tipoMovimiento;
    FisicoEspecial fisEsp;

    public MovimientoAtaque(String nombreHabilidad, int consumo, int potencia, Tipo tipoMovimiento, FisicoEspecial fisEsp) {
        super(nombreHabilidad, consumo);
        this.potencia = potencia;
        this.tipoMovimiento = tipoMovimiento;
        this.fisEsp = fisEsp;
    }

    public int getPotencia() {
        return potencia;
    }
    public Tipo getTipoMovimiento() {
        return tipoMovimiento;
    }
    public FisicoEspecial getFisEsp() {
        return fisEsp;
    }
}