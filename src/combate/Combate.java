package combate;

import java.util.LinkedList;

import entrenador.Entrenador;
import enumerados.Tipo;
import pokemon.Pokemon;

public abstract class Combate {

    //lista provisional
    LinkedList<Pokemon> pokemonses;
    LinkedList<Movimiento> movimientos;


    private Entrenador ganador;
    private Entrenador perdedor;
    private Entrenador jugador;
    private Entrenador rival;
    //private Turnos turno;
    private int turno;
    private int koRival;
    private int koJugador;
    private Pokemon pokemonActivo;

    Combate(Entrenador jugador, Entrenador rival) {

        pokemonses = new LinkedList<>();
        llenar();

        this.jugador = jugador;
        this.rival = rival;
        this.turno = 1;
        this.koRival = 0;
        this.koJugador = 0;
        this.pokemonActivo = jugador.getEquipo().get(0);
    }

    private void llenar() {

        Pokemon pokemon1 = new Pokemon("TIRANITAR", "", 5, 50, 100, 100, 134, 
                                        110, 95, 100, 61, Tipo.valueOf("ROCA"), Tipo.valueOf("SINIESTRO"), habilidades);

        Pokemon pokemon2 = new Pokemon("BULBASAUR", "", 10, 100, vitalidad, estamina, ataque, 
                                        defensa, ataqueEspecial, defensaEspecial, velocidad, tipo1, tipo2, habilidades);

        Pokemon pokemon3 = new Pokemon("CHARMANDER", "", 15, 150, vitalidad, estamina, ataque, 
                                        defensa, ataqueEspecial, defensaEspecial, velocidad, tipo1, tipo2, habilidades);

        Pokemon pokemon4 = new Pokemon("SQUIRTLE", "", 20, 200, vitalidad, estamina, ataque, 
                                        defensa, ataqueEspecial, defensaEspecial, velocidad, tipo1, tipo2, habilidades);

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
