package Pokemon.src.combate;

import Pokemon.src.entrenador.Entrenador;

public class Combate {

    private Turnos turno;
    private Entrenador jugador;
    private Entrenador rival;
    private int koJugador;
    private int koRival;
    private Entrenador ganador;
    private Entrenador perdedor;

    Combate(Turnos turno, Entrenador jugador, Entrenador rival, Entrenador ganador, Entrenador perdedor) {
        this.turno = turno;
        this.jugador = jugador;
        this.rival = rival;
        this.koJugador = 0;
        this.koRival = 0;
        this.ganador = ganador;
        this.perdedor = perdedor;
    }

    public Turnos getTurno() {
        return turno;
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

    public void setTurno(Turnos turno) {
        this.turno = turno;
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
