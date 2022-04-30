package pokemon.movimientos;

import pokemon.enumerados.Mejora;
import pokemon.enumerados.Tipo;

public class MovimientoMejora extends Movimiento {

    private int contadorTurno;
    private Mejora buff;

    public MovimientoMejora(int numHabilidad, String nombreHabilidad, Tipo tipoMovimiento, int consumo, 
    float precision, int contadorTurno, Mejora buff) {
        super(numHabilidad, nombreHabilidad, tipoMovimiento, consumo, precision);
        this.contadorTurno = contadorTurno;
        this.buff = buff;
    }

    public int getContadorTurno() {
        return contadorTurno;
    }
    public Mejora getBuff() {
        return buff;
    }
}