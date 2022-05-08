package Pokemon.src.pokemon.movimientos;

import Pokemon.src.pokemon.enumerados.Mejora;

public class MovimientoMejora extends Movimiento {

    private int duracion;
    private Mejora buff;

    public MovimientoMejora(String nombreHabilidad, int consumo, int duracion, Mejora buff) {
        super(nombreHabilidad, consumo);
        this.duracion = duracion;
        this.buff = buff;
    }

    public int getDuracion() {
        return duracion;
    }
    public Mejora getBuff() {
        return buff;
    }
}