package combate;

import entrenador.Entrenador;
import pokemon.Pokemon;

public class CombateEntrenador extends Combate {

    private Entrenador ganador;
    private Entrenador perdedor;
    private Entrenador rival;
    private int koRival;
    private int koJugador;

    CombateEntrenador(Entrenador jugador, Turnos turno, Pokemon pokemonActivPokemon, Entrenador ganador,
            Entrenador perdedor, Entrenador rival, int koRival, int koJugador) {
        super(jugador, turno, pokemonActivPokemon);
        this.ganador = ganador;
        this.perdedor = perdedor;
        this.rival = rival;
        this.koRival = koRival;
        this.koJugador = koJugador;
    }

    public Entrenador getGanador() {
        return ganador;
    }

    public Entrenador getPerdedor() {
        return perdedor;
    }

    public Entrenador getRival() {
        return rival;
    }

    public int getKoRival() {
        return koRival;
    }

    public int getKoJugador() {
        return koJugador;
    }

    public void setGanador(Entrenador ganador) {
        this.ganador = ganador;
    }

    public void setPerdedor(Entrenador perdedor) {
        this.perdedor = perdedor;
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

    public void koPokemon(Pokemon pokemon){
    }

    public void checkGanador() {
        if (this.getKoJugador() == 4) {
            this.setGanador(this.getJugador());
            this.setPerdedor(this.getRival());
            System.out.println("¡Has ganado el combate!");
            this.getGanador()
                    .setPokedollar(this.getGanador().getPokedollar() + (this.getPerdedor().getPokedollar() / 3) * 2);

            System.out.println("Has ganado " + (this.getPerdedor().getPokedollar() / 3) + "$ pokedollares.");
        } else if (this.getKoRival() == 4) {
            this.setGanador(this.getRival());
            this.setPerdedor(this.getGanador());
            System.out.println("¡" + this.getRival().getNombre() + " ha ganado el combate!");
            this.getPerdedor().setPokedollar(this.getPerdedor().getPokedollar() / 3);
            System.out.println("Has perdido " + (this.getPerdedor().getPokedollar() / 3) + "$ pokedollares.");
        }

    }

    @Override
    public boolean huir() {
        this.setGanador(this.getRival());
        this.setPerdedor(this.getJugador());

        System.out.println("Te retiras. ¡" + this.getRival().getNombre() + " ha ganado el combate!");
        this.getPerdedor().setPokedollar(this.getPerdedor().getPokedollar() / 3);
        System.out.println("Has perdido " + (this.getPerdedor().getPokedollar() / 3) + "$ pokedollares.");

        return false;
    }

}
