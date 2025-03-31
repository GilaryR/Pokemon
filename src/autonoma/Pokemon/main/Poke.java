
package autonoma.Pokemon.main;

import autonoma.Pokemon.models.Bulbasaur;
import autonoma.Pokemon.models.Charmander;
import autonoma.Pokemon.models.Pikachu;
import autonoma.Pokemon.models.Pokemon;
import autonoma.Pokemon.models.Squirtle;

/**
 * @author Gilary
 * @since 2025/03/31
 * @version 1.0
 */

public class Poke {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pokemon pikachu = new Pikachu();
        Pokemon charmander = new Charmander();
        Pokemon squirtle = new Squirtle();
        Pokemon bulbasaur = new Bulbasaur();

        pikachu.atacar();
        pikachu.defender();
        ((Pikachu) pikachu).atacarImpactrueno();

        charmander.atacar();
        charmander.defender();
        ((Charmander) charmander).atacarLanzallamas();

        squirtle.atacar();
        squirtle.defender();
        ((Squirtle) squirtle).atacarHidrobomba();

        bulbasaur.atacar();
        bulbasaur.defender();
        ((Bulbasaur) bulbasaur).atacarHojaAfilada();
    }
}
    
