
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
        return nombre + " uso Placaje!"; }

    @Override
    public String atacarArañazo() { 
        return nombre + " uso Arañazo!"; }

    @Override
    public String atacarMordisco() { 
        return nombre + " uso Mordisco!"; }

   
    @Override
    public String atacarImpactrueno() { 
        return nombre + " uso Impactrueno!"; }

    @Override
    public String atacarPuñoTrueno() { 
        return nombre + " uso Puño Trueno!"; }

    @Override
    public String atacarRayo() { 
        return nombre + " uso Rayo!"; }

    @Override
    public String atacarRayoCarga() { 
        return nombre + " uso Rayo Carga!"; }
}

