package Pokemon.src.pokemon.movimientos;

import Pokemon.src.pokemon.enumerados.Tipo;

public class MovimientoAtaque extends Movimiento {

    int potencia;

    public MovimientoAtaque(int numHabilidad, String nombreHabilidad, Tipo tipoMovimiento, 
    int consumo, int precision, int potencia) {
        super(numHabilidad, nombreHabilidad, tipoMovimiento, consumo, precision);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }
}