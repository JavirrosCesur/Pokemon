package combate;

import entrenador.Entrenador;
import pokemon.Pokemon;

public abstract class Combate {

    private Entrenador ganador;
    private Entrenador perdedor;
    private Entrenador jugador;
    private Entrenador rival;
    private Turnos turno;
    private int koRival;
    private int koJugador;
    private Pokemon pokemonActivo;

    Combate(Entrenador jugador, Entrenador rival, Turnos turno, int koRival, int koJugador,
            Pokemon pokemonActivPokemon) {
        this.jugador = jugador;
        this.rival = rival;
        this.turno = turno;
        this.koRival = koRival;
        this.koJugador = koJugador;
        this.pokemonActivo = pokemonActivPokemon;
    }

    public Entrenador getGanador() {
        return ganador;
    }

    public Entrenador getPerdedor() {
        return perdedor;
    }

    public Entrenador getJugador() {
        return jugador;
    }

    public Entrenador getRival() {
        return rival;
    }

    public Turnos getTurno() {
        return turno;
    }

    public int getKoRival() {
        return koRival;
    }

    public int getKoJugador() {
        return koJugador;
    }

    public Pokemon getPokemonActivo() {
        return pokemonActivo;
    }

    public void setGanador(Entrenador ganador) {
        this.ganador = ganador;
    }

    public void setPerdedor(Entrenador perdedor) {
        this.perdedor = perdedor;
    }

    public void setJugador(Entrenador jugador) {
        this.jugador = jugador;
    }

    public void setRival(Entrenador rival) {
        this.rival = rival;
    }

    public void setTurno(Turnos turno) {
        this.turno = turno;
    }

    public void setKoRival(int koRival) {
        this.koRival = koRival;
    }

    public void setKoJugador(int koJugador) {
        this.koJugador = koJugador;
    }

    public void setPokemonActivo(Pokemon pokemonActivo) {
        this.pokemonActivo = pokemonActivo;
    }

}
