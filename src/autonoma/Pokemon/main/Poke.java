
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
       
        // Crear instancias de los Pokémon
        Bulbasaur bulbasaur = new Bulbasaur(1, "Bulbasaur", 6.9, "Primera");
        Pikachu pikachu = new Pikachu(25, "Pikachu", 6.0, "Primera");
        Charmander charmander = new Charmander(4, "Charmander", 8.5, "Primera");
        Squirtle squirtle = new Squirtle(7, "Squirtle", 9.0, "Primera");

        // Mostrar los ataques de cada Pokémon
        System.out.println(bulbasaur.atacarPlacaje());
        System.out.println(bulbasaur.atacarLatigoCepa());

        System.out.println(pikachu.atacarImpactrueno());
        System.out.println(pikachu.atacarRayo());

        System.out.println(charmander.atacarAscuas());
        System.out.println(charmander.atacarLanzaLlamas());

        System.out.println(squirtle.atacarPistolaAgua());
        System.out.println(squirtle.atacarHidropulso());
    }
}
