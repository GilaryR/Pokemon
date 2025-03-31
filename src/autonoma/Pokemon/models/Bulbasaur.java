
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
        return nombre + " usó Placaje!"; }

    @Override
    public String atacarArañazo() {
        return nombre + " usó Arañazo!"; }

    @Override
    public String atacarMordisco() { 
        return nombre + " usó Mordisco!"; }

    @Override
    public String atacarParalizar() { 
        return nombre + " usó Paralizar!"; }

    @Override
    public String atacarDrenaje() { 
        return nombre + " usó Drenaje!"; }

    @Override
    public String atacarHojaAfilada() {
        return nombre + " usó Hoja Afilada!"; }

    @Override
    public String atacarLatigoCepa() {
        return nombre + " usó Látigo Cepa!"; }
}