package entrenador;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import combate.Combate;
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

    public boolean dejarPokemon(int numero) {
        if (this.equipo.size() < 2) {
            System.out.println("No puedes tener menos de un pokemon en el equipo.");
            return false;
        }

        else {
            System.out.println("Has dejado a " + this.equipo.get(numero).getMote() + " en la caja.");
            this.caja.add(this.equipo.get(numero));
            this.equipo.remove(numero);
            return true;
        }
    }

    public boolean sacarPokemon(int numero) {
        if (equipo.size() == 4) {
            System.out.println("No puedes llevar mas pokemons");
            return false;
        } else if (equipo.size() <= 3) {
            this.equipo.add(this.caja.get(numero));
            return true;
        }
        return false;
    }

    public boolean capturarPokemon(Pokemon pokemon) {
        int ratio = (int) (Math.random() * 3);
        if (ratio == 0) {
            System.out.println("El pokemon se ha escapado.");
            return false;
        } else {
            System.out.println("Has capturado al pokemon");
            if (this.equipo.size() == 4) {
                this.caja.add(pokemon);
                System.out.println(pokemon.getNombre() + " ha sido añadido a la caja.");
            } else {
                this.equipo.add(pokemon);
                System.out.println(pokemon.getNombre() + " ha sido añadido a tu equipo.");
            }
            System.out.println("Ponle un mote a tu pokemon: ");
            this.nombrarPokemon(pokemon, nombre);
            return true;
        }
    }

    public void nombrarPokemon(Pokemon pokemon, String nombre) {
        pokemon.setMote(nombre);
    }

    public boolean ordenPokemon(Pokemon pokemon) {
        return false;
    }

    public Boolean cambiarPosiciones(int numero) {
        Collections.swap(this.equipo, 0, numero);
        return true;
    }

    public boolean huirCombate(Entrenador ganador) {
        return false;
    }

}