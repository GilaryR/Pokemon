
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
    protected String temporada;

    public Pokemon(int numPokedex, String nombre, double peso, String temporada) {
        this.numPokedex = numPokedex;
        this.nombre = nombre;
        this.peso = peso;
        this.temporada = temporada;
    }

    public abstract String atacarPlacaje();
    public abstract String atacarArañazo();
    public abstract String atacarMordisco();
}


