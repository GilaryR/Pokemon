
package autonoma.Pokemon.models;

/**
 * @author Gilary
 * @since 2025/03/31
 * @version 1.0
 */
public class Charmander extends Pokemon implements PokemonFuego {
    public Charmander() {
        super(4, "Charmander", 8.5, 1);
    }
    
    public void atacarPunioFuego() {
        System.out.println(nombre + " usa Puño Fuego!");
    }
    
    public void atacarAscuas() {
        System.out.println(nombre + " usa Ascuas!");
    }
    
    public void atacarLanzallamas() {
        System.out.println(nombre + " usa Lanzallamas!");
    }
}

