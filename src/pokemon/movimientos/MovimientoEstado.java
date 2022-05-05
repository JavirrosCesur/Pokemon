package Pokemon.src.pokemon.movimientos;

import Pokemon.src.pokemon.enumerados.EstadoPrincipal;
import Pokemon.src.pokemon.enumerados.EstadoSecundario;
import Pokemon.src.pokemon.enumerados.Tipo;

public class MovimientoEstado extends Movimiento {

    private int contadorTurno;
    private EstadoPrincipal estadoPrincipal;
    private EstadoSecundario estadoSecundario;

    public MovimientoEstado(int numHabilidad, String nombreHabilidad, Tipo tipoMovimiento, int consumo, 
    int precision, int contadorTurno, EstadoPrincipal estadoPrincipal, EstadoSecundario estadoSecundario) {
        super(numHabilidad, nombreHabilidad, tipoMovimiento, consumo, precision);
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
}