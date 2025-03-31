
package autonoma.Pokemon.models;

/**
 * @author Gilary
 * @since 2025/03/31
 * @version 1.0
 */

public class Pikachu extends Pokemon implements PokemonElectrico {
    public Pikachu(int numPokedex, String nombre, double peso, String temporada) {
        super(numPokedex, nombre, peso, temporada);
    }

    @Override
    public String atacarPlacaje() { 
        return nombre + " usó Placaje!"; }

    @Override
    public String atacarArañazo() { 
        return nombre + " usó Arañazo!"; }

    @Override
    public String atacarMordisco() { 
        return nombre + " usó Mordisco!"; }

   
    @Override
    public String atacarImpactrueno() { 
        return nombre + " usó Impactrueno!"; }

    @Override
    public String atacarPuñoTrueno() { 
        return nombre + " usó Puño Trueno!"; }

    @Override
    public String atacarRayo() { 
        return nombre + " usó Rayo!"; }

    @Override
    public String atacarRayoCarga() { 
        return nombre + " usó Rayo Carga!"; }
}

