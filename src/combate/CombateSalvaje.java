package combate;

import entrenador.Entrenador;
import pokemon.Pokemon;

public class CombateSalvaje extends Combate{

    CombateSalvaje(Entrenador ganador, Entrenador jugador, Entrenador rival, Turnos turno, int koRival, int koJugador,
            Pokemon pokemonActivPokemon) {
        super(ganador, jugador, rival, turno, koRival, koJugador, pokemonActivPokemon);
    }
    
}
