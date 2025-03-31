
package autonoma.Pokemon.models;

/**
 * @author Gilary
 * @since 2025/03/31
 * @version 1.0
 */
public abstract class Pokemon {
    
    protected int numPokedex;
    protected String nombre;
    protected double peso;
    protected int temporada;
    
    public Pokemon(int numPokedex, String nombre, double peso, int temporada) {
        this.numPokedex = numPokedex;
        this.nombre = nombre;
        this.peso = peso;
        this.temporada = temporada;
    }
    
    public void atacarPlacaje() {
        System.out.println(nombre + " usa Placaje!");
    }
    
    public void atacarArañazo() {
        System.out.println(nombre + " usa Arañazo!");
    }
    
    public void atacarMordisco() {
        System.out.println(nombre + " usa Mordisco!");
    }
}

