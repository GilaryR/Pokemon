
package autonoma.Pokemon.models;

/**
 * @author Gilary
 * @since 2025/03/31
 * @version 1.0
 */
public class Charmander implements Pokemon, PokemonFuego {
    @Override
    public void atacar() {
        System.out.println("Charmander usa Lanzallamas!");
    }

    @Override
    public void defender() {
        System.out.println("Charmander se protege con su cola de fuego.");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Charmander escupe fuego ardiente!");
    }
}
