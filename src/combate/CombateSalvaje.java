package combate;

import entrenador.Entrenador;
import pokemon.Pokemon;

public class CombateSalvaje extends Combate {

    private Pokemon pokemonRival;

    CombateSalvaje(Entrenador jugador, Turnos turno, Pokemon pokemonRival) {
        super(jugador, turno);
        this.pokemonRival = pokemonRival;
    }

    public Pokemon getPokemonRival() {
        return pokemonRival;
    }

    public void setPokemonRival(Pokemon pokemonRival) {
        this.pokemonRival = pokemonRival;
    }

    @Override
    public boolean huir() {
        System.out.println("¡Has escapado con  exito!");
        return true;
    }

}
