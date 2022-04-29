package Pokemon.src.movimientos;

import Pokemon.src.enumerados.EstadoPrincipal;
import Pokemon.src.enumerados.EstadoSecundario;

public class MovimientoEstado extends Movimiento {
    
    private int contadorTurno;
    private EstadoPrincipal estadoPrincipal;
    private EstadoSecundario estadoSecundario;

    public MovimientoEstado(int numHabilidad, String nombreHabilidad, int contadorTurno, 
    EstadoPrincipal estadoPrincipal, EstadoSecundario estadoSecundario) {
        super(numHabilidad, nombreHabilidad);
        this.contadorTurno = contadorTurno;
        this.estadoPrincipal = estadoPrincipal;
        this.estadoSecundario = estadoSecundario;
    }

    public int getContadorTurno() {
        return contadorTurno;
    }
    public EstadoPrincipal getEstadoPrincipal() {
        return estadoPrincipal;
    }
    public EstadoSecundario getEstadoSecundario() {
        return estadoSecundario;
    }

    public void setContadorTurno(int contadorTurno) {
        this.contadorTurno = contadorTurno;
    }
    public void setEstadoPrincipal(EstadoPrincipal estadoPrincipal) {
        this.estadoPrincipal = estadoPrincipal;
    }
    public void setEstadoSecundario(EstadoSecundario estadoSecundario) {
        this.estadoSecundario = estadoSecundario;
    }
}