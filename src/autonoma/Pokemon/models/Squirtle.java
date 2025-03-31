
package autonoma.Pokemon.models;

/**
 * @author Gilary
 * @since 2025/03/31
 * @version 1.0
 */
public class Squirtle extends Pokemon implements PokemonAgua {
    public Squirtle() {
        super(7, "Squirtle", 9.0, 1);
    }
    
    public void atacarHidrobomba() {
        System.out.println(nombre + " usa Hidrobomba!");
    }
    
    public void atacarPistolaAgua() {
        System.out.println(nombre + " usa Pistola Agua!");
    }
    
    public void atacarBurbuja() {
        System.out.println(nombre + " usa Burbuja!");
    }
    
    public void atacarHidropulso() {
        System.out.println(nombre + " usa Hidropulso!");
    }
}
