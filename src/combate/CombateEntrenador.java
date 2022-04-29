package combate;

import entrenador.Entrenador;
import pokemon.Pokemon;

public class CombateEntrenador extends Combate {

    CombateEntrenador(Entrenador jugador, Entrenador rival, Turnos turno, int koRival, int koJugador,
            Pokemon pokemonActivPokemon) {
        super(jugador, rival, turno, koRival, koJugador, pokemonActivPokemon);
    }








    
    public void checkGanador() {
        if (this.getKoJugador() == 4) {
            this.setGanador(this.getJugador());
            this.setPerdedor(this.getRival());
            System.out.println("¡Has ganado el combate!");
            this.getGanador().setPokedollar(this.getGanador().getPokedollar() + (this.getPerdedor().getPokedollar() / 3) * 2);
            System.out.println("Has ganado " + (this.getPerdedor().getPokedollar() / 3) * 2 + "$ pokedollares.");
        } else if (this.getKoRival() == 4) {
            this.setGanador(this.getRival());
            this.setPerdedor(this.getGanador());
            System.out.println("¡" + this.getRival().getNombre() + " ha ganado el combate!");
            this.getPerdedor().setPokedollar(this.getPerdedor().getPokedollar() / 3);
            System.out.println("Has perdido " + (this.getPerdedor().getPokedollar() / 3) * 2 + "$ pokedollares.");
        }

        
        

    }

}
