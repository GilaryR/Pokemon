
package autonoma.Pokemon.models;

/**
 * @author Gilary
 * @since 2025/03/31
 * @version 1.0
 */
public class Bulbasaur extends Pokemon implements PokemonPlanta {
    public Bulbasaur() {
        super(1, "Bulbasaur", 6.9, 1);
    }
    
    public void atacarParalizar() {
        System.out.println(nombre + " usa Paralizar!");
    }
    
    public void atacarDrenaje() {
        System.out.println(nombre + " usa Drenaje!");
    }
    
    public void atacarHojaAfilada() {
        System.out.println(nombre + " usa Hoja Afilada!");
    }
    
    public void atacarLatigoCepa() {
        System.out.println(nombre + " usa Látigo Cepa!");
    }
}
