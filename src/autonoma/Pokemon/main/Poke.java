
package autonoma.Pokemon.main;

import autonoma.Pokemon.models.Bulbasaur;
import autonoma.Pokemon.models.Charmander;
import autonoma.Pokemon.models.Pikachu;
import autonoma.Pokemon.models.Squirtle;

/**
 *
 * @author jgiugtiñut
 */
public class Poke {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pikachu pikachu = new Pikachu();
        Bulbasaur bulbasaur = new Bulbasaur();
        Charmander charmander = new Charmander();
        Squirtle squirtle = new Squirtle();

        pikachu.atacarImpactrueno();
        bulbasaur.atacarHojaAfilada();
        charmander.atacarLanzallamas();
        squirtle.atacarHidrobomba();

    }
    
}
