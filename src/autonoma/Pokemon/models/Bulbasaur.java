
package autonoma.Pokemon.models;

/**
 * @author Gilary
 * @since 2025/03/31
 * @version 1.0
 */
public class Bulbasaur extends Pokemon implements PokemonPlanta {
    public Bulbasaur(int numPokedex, String nombre, double peso, String temporada) {
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
    public String atacarParalizar() { 
        return nombre + " uso Paralizar!"; }

    @Override
    public String atacarDrenaje() { 
        return nombre + " uso Drenaje!"; }

    @Override
    public String atacarHojaAfilada() {
        return nombre + " uso Hoja Afilada!"; }

    @Override
    public String atacarLatigoCepa() {
        return nombre + " uso Látigo Cepa!"; }
}