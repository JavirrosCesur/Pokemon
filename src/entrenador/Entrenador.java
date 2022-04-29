package entrenador;

import java.util.ArrayList;
import pokemon.Pokemon;

public class Entrenador {

    private String nombre;
    private ArrayList<Pokemon> equipo;
    private ArrayList<Pokemon> caja;
    private int pokedollar;

    Entrenador(String nombre, ArrayList<Pokemon> equipo, ArrayList<Pokemon> caja) {
        this.nombre = nombre;
        this.equipo = equipo;
        this.caja = caja;
        this.pokedollar = (int) (Math.random() * 201 + 800);
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Pokemon> getEquipo() {
        return equipo;
    }

    public ArrayList<Pokemon> getCaja() {
        return caja;
    }

    public int getPokedollar() {
        return pokedollar;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEquipo(ArrayList<Pokemon> equipo) {
        this.equipo = equipo;
    }

    public void setCaja(ArrayList<Pokemon> caja) {
        this.caja = caja;
    }

    public void setPokedollar(int pokedollar) {
        this.pokedollar = pokedollar;
    }

    public boolean dejarPokemon(int numero){
        if(this.equipo.size() < 2){
            System.out.println("¡Debes tener al menos un pokemon en el equipo!");
            return false;
        }
        if(this.equipo.size() >= 2){
            this.caja.add(this.equipo.get(numero));
            System.out.println("Has dejado a " + this.equipo.get(numero).getMote());
        }
        return false;
    }

}
