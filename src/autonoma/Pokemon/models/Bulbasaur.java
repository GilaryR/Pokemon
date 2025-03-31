
package autonoma.Pokemon.models;

/**
 * @author Gilary
 * @since 2025/03/31
 * @version 1.0
 */
public class Bulbasaur implements Pokemon, PokemonPlanta {
    @Override
    public void atacar() {
        System.out.println("Bulbasaur usa Latigazo Cepa!");
    }

    @Override
    public void defender() {
        System.out.println("Bulbasaur se protege con sus hojas.");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("Bulbasaur lanza hojas cortantes!");
    }
}
