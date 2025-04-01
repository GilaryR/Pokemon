package autonoma.Pokemon.models;

/**
 * @author Alejandra
 * @since 2025/03/31
 * @version 1.0
 */
public class Squirtle extends Pokemon implements PokemonAgua {
    public Squirtle(int numPokedex, String nombre, double peso, String temporada) {
        super(numPokedex, nombre, peso, temporada);
    }

    @Override
    public String atacarPlacaje() { return nombre + " uso Placaje!"; }

    @Override
    public String atacarArañazo() { return nombre + " uso Arañazo!"; }

    @Override
    public String atacarMordisco() { return nombre + " us Mordisco!"; }

    @Override
    public String atacarHidroBomba() { return nombre + " uso Hidro Bomba!"; }

    @Override
    public String atacarPistolaAgua() { return nombre + " uso Pistola Agua!"; }

    @Override
    public String atacarBurbuja() { return nombre + " uso Burbuja!"; }

    @Override
    public String atacarHidropulso() { return nombre + " uso Hidropulso!"; }
}