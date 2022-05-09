package Pokemon.src.combate;

public class Turnos {
    
    private int numeroTurno;
    private String accionJugador;
    private String accionRival;
    

    
    public int getNumeroTurno() {
        return numeroTurno;
    }
    public String getAccionJugador() {
        return accionJugador;
    }
    public String getAccionRival() {
        return accionRival;
    }

    public void setNumeroTurno() {
        for(numeroTurno = 0; numeroTurno < 99; numeroTurno++);
    }
    public void setAccionJugador(String accionJugador) {
        this.accionJugador = accionJugador;
    }
    public void setAccionRival(String accionRival) {
        this.accionRival = accionRival;
    }
}