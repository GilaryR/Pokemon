
package autonoma.Pokemon.models;

/**
 * @author Gilary
 * @since 2025/03/31
 * @version 1.0
 */

public class Pikachu implements Pokemon, PokemonElectrico {
    @Override
    public void atacar() {
        System.out.println("Pikachu usa Impactrueno!");
    }

    @Override
    public void defender() {
        System.out.println("Pikachu se protege con un campo eléctrico.");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Pikachu lanza un rayo eléctrico!");
    }
}


