
package autonoma.Pokemon.models;

/**
 * @author Gilary
 * @since 2025/03/31
 * @version 1.0
 */
public class Pikachu extends Pokemon implements PokemonElectrico {
    public Pikachu() {
        super(25, "Pikachu", 6.0, 1);
    }
    
    public void atacarImpactrueno() {
        System.out.println(nombre + " usa Impactrueno!");
    }
    
    public void atacarPunioTrueno() {
        System.out.println(nombre + " usa Puño Trueno!");
    }
    
    public void atacarRayo() {
        System.out.println(nombre + " usa Rayo!");
    }
    
    public void atacarRayoCarga() {
        System.out.println(nombre + " usa Rayo Carga!");
    }
}

