package Pokemon.src.movimientos;

import Pokemon.src.enumerados.Mejora;

public class MovimientoMejora extends Movimiento {
    
    private int contadorTurno;
    private Mejora buff;

    public MovimientoMejora(int numHabilidad, String nombreHabilidad, int contadorTurno, Mejora buff) {
        super(numHabilidad, nombreHabilidad);
        this.contadorTurno = contadorTurno;
        this.buff = buff;
    }

    public int getContadorTurno() {
        return contadorTurno;
    }
    public Mejora getBuff() {
        return buff;
    }

    public void setContadorTurno(int contadorTurno) {
        this.contadorTurno = contadorTurno;
    }
    public void setBuff(Mejora buff) {
        this.buff = buff;
    }
}