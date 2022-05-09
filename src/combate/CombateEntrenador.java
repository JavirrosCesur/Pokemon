package Pokemon.src.combate;

import Pokemon.src.entrenador.Entrenador;
import Pokemon.src.pokemon.*;

public class CombateEntrenador extends Combate{

    CombateEntrenador(Entrenador ganador, Entrenador jugador, Entrenador rival, Turnos turno, int koRival,
            int koJugador, Pokemon pokemonActivPokemon) {
        super(ganador, jugador, rival, turno, koRival, koJugador, pokemonActivPokemon);
    }

 
    
}
