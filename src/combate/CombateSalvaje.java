package combate;

import entrenador.Entrenador;
import pokemon.Pokemon;

public class CombateSalvaje extends Combate{

    CombateSalvaje(Entrenador jugador, Entrenador rival, Turnos turno, int koRival, int koJugador,
            Pokemon pokemonActivPokemon) {
        super(jugador, turno, pokemonActivPokemon);
    }

    @Override
    public boolean huir() {
        System.out.println("¡Has escapado con  exito!");
        return true;
    }


}
