package combate;

import entrenador.Entrenador;
import pokemon.Pokemon;

public abstract class Combate {


    private Entrenador jugador;
    private Turnos turno;
    private Pokemon pokemonActivo;

    Combate(Entrenador jugador, Turnos turno, Pokemon pokemonActivPokemon) {
        this.jugador = jugador;
        this.turno = turno;
        this.pokemonActivo = pokemonActivPokemon;
    }

    public Entrenador getJugador() {
        return jugador;
    }

    public Turnos getTurno() {
        return turno;
    }

    public Pokemon getPokemonActivo() {
        return pokemonActivo;
    }

    public void setJugador(Entrenador jugador) {
        this.jugador = jugador;
    }

    public void setTurno(Turnos turno) {
        this.turno = turno;
    }

    public void setPokemonActivo() {
        this.pokemonActivo = this.jugador.getEquipo().get(0);
        //Cambiar por metodo de la clase entrenador
    }


    public abstract boolean huir();

}
