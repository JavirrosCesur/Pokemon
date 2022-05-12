package Pokemon.src.combate;

public class Turnos {
    
    private int numeroTurno;
    private String accionJugador;
    private String accionRival;
    
    public Turnos(int numeroTurno, String accionJugador, String accionRival){
        this.numeroTurno = numeroTurno;
        this.accionJugador = accionJugador;
        this.accionRival = accionRival;
    }

    public int getNumeroTurno() {
        return numeroTurno;
    }
    public String getAccionJugador() {
        return accionJugador;
    }
    public String getAccionRival() {
        return accionRival;
    }

    public void setNumeroTurno(int numeroTurno) {
        this.numeroTurno = numeroTurno;
    }
    public void setAccionJugador(String accionJugador) {
        this.accionJugador = accionJugador;
    }
    public void setAccionRival(String accionRival) {
        this.accionRival = accionRival;
    }
}