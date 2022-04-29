package combate;

import entrenador.Entrenador;
import pokemon.Pokemon;

public class CombateEntrenador extends Combate{

    CombateEntrenador(Entrenador ganador, Entrenador jugador, Entrenador rival, Turnos turno, int koRival,
            int koJugador, Pokemon pokemonActivPokemon) {
        super(ganador, jugador, rival, turno, koRival, koJugador, pokemonActivPokemon);
    }

 
    
}
