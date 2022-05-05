package combate;

import entrenador.Entrenador;

public abstract class Combate {


    private Entrenador jugador;
    private Turnos turno;

    Combate(Entrenador jugador, Turnos turno) {
        this.jugador = jugador;
        this.turno = turno;
    }

    public Entrenador getJugador() {
        return jugador;
    }

    public Turnos getTurno() {
        return turno;
    }

    public void setJugador(Entrenador jugador) {
        this.jugador = jugador;
    }

    public void setTurno(Turnos turno) {
        this.turno = turno;
    }

    public abstract boolean huir();

}
