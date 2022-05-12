package Pokemon.src.modelo.combate;

import java.util.ArrayList;
import java.util.List;

import Pokemon.src.modelo.entrenador.Entrenador;

public class Combate {

    private List<Turno> turnos;
    private Entrenador jugador;
    private Entrenador rival;
    private int koJugador;
    private int koRival;
    private Entrenador ganador;
    private Entrenador perdedor;

    Combate(Entrenador jugador, Entrenador rival, Entrenador ganador, Entrenador perdedor) {
        this.turnos = new ArrayList<>();
        this.jugador = jugador;
        this.rival = rival;
        this.koJugador = 0;
        this.koRival = 0;
        this.ganador = ganador;
        this.perdedor = perdedor;
    }

    public List<Turno> getTurnos() {
        return turnos;
    }

    public Entrenador getJugador() {
        return jugador;
    }

    public Entrenador getRival() {
        return rival;
    }

    public int getKoJugador() {
        return koJugador;
    }

    public int getKoRival() {
        return koRival;
    }

    public Entrenador getGanador() {
        return ganador;
    }

    public Entrenador getPerdedor() {
        return perdedor;
    }

    public void setTurnos(List<Turno> turnos) {
        this.turnos = turnos;
    }

    public void setJugador(Entrenador jugador) {
        this.jugador = jugador;
    }

    public void setRival(Entrenador rival) {
        this.rival = rival;
    }

    public void setKoJugador(int koJugador) {
        this.koJugador = koJugador;
    }

    public void setKoRival(int koRival) {
        this.koRival = koRival;
    }

    public void setGanador(Entrenador ganador) {
        this.ganador = ganador;
    }

    public void setPerdedor(Entrenador perdedor) {
        this.perdedor = perdedor;
    }

    public void koPokemon(){
        if(this.jugador.getPrimerPokemon().getVitalidadActual() <= 0){
            this.koRival++;
        }
        else if(this.rival.getPrimerPokemon().getVitalidadActual() <= 0){
            this.koJugador++;
        }
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

    public boolean huir() {
        this.setGanador(this.getRival());
        this.setPerdedor(this.getJugador());

        System.out.println("Te retiras. ¡" + this.getRival().getNombre() + " ha ganado el combate!");
        this.getPerdedor().setPokedollar(this.getPerdedor().getPokedollar() / 3);
        System.out.println("Has perdido " + (this.getPerdedor().getPokedollar() / 3) + "$ pokedollares.");

        return false;
    }

}
