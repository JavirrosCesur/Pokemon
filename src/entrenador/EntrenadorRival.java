package entrenador;

import java.util.ArrayList;
import java.util.Collections;

import pokemon.Pokemon;
import pokemon.movimientos.Movimiento;

public class EntrenadorRival {

    private String nombreRival;
    private ArrayList<Pokemon> equipoRival;
    private int pokedollarRival;
    private Pokemon primerPokemonRival;

    EntrenadorRival(String nombreRival, ArrayList<Pokemon> equipoRival, Pokemon primerPokemonRival) {
        this.nombreRival = nombreRival;
        this.equipoRival = equipoRival;
        this.primerPokemonRival = primerPokemonRival;
        this.pokedollarRival = (int) (Math.random() * 201 + 800);
    }

    public String getNombreRival() {
        return nombreRival;
    }

    public ArrayList<Pokemon> getEquipoRival() {
        return equipoRival;
    }

    public int getPokedollarRival() {
        return pokedollarRival;
    }

    public Pokemon getPrimerPokemonRival() {
        return primerPokemonRival;
    }

    public void setNombreRival(String nombreRival) {
        this.nombreRival = nombreRival;
    }

    public void setEquipoRival(ArrayList<Pokemon> equipoRival) {
        this.equipoRival = equipoRival;
    }

    public void setPokedollarRival(int pokedollarRival) {
        this.pokedollarRival = pokedollarRival;
    }

    public void setPrimerPokemonRival(Pokemon primerPokemonRival) {
        this.primerPokemonRival = primerPokemonRival;
    }

    public Pokemon primerPokemonRival() {
        if (this.equipoRival.get(0).getVitalidadActual() > 0) {
            this.primerPokemonRival = this.equipoRival.get(0);
        }

        else {
            if (this.equipoRival.get(1).getVitalidadActual() > 0) {
                this.primerPokemonRival = this.equipoRival.get(1);
            }

            else {
                if (this.equipoRival.get(2).getVitalidadActual() > 0) {
                    this.primerPokemonRival = this.equipoRival.get(2);
                }

                else {
                    if (this.equipoRival.get(3).getVitalidadActual() > 0) {
                        this.primerPokemonRival = this.equipoRival.get(3);

                    }
                }
            }
        }

        return primerPokemonRival;

    }

    public void ordenPokemonRival(Movimiento habilidad, Pokemon pokemon) {
        this.primerPokemonRival().usarMovimiento(habilidad, pokemon);
    }

    public Boolean cambiarPosiciones(int numero) {
        Collections.swap(this.equipoRival, 0, numero);
        return true;
    }
}
