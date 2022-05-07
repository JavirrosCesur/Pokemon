package Pokemon.src.pokemon.movimientos;

import Pokemon.src.pokemon.enumerados.Mejora;

public class MovimientoMejora extends Movimiento {

    private int duracion;
    private Mejora buff;
    private int nivelBuff;

    public MovimientoMejora(String nombreHabilidad, int consumo, int duracion, Mejora buff) {
        super(nombreHabilidad, consumo);
        this.duracion = duracion;
        this.buff = buff;
        this.nivelBuff = 0;
    }

    public int getDuracion() {
        return duracion;
    }
    public Mejora getBuff() {
        return buff;
    }
    public int getNivelBuff() {
        return nivelBuff;
    }
}