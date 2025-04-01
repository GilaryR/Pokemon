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
    public String atacarPlacaje() { return nombre + " usó Placaje!"; }

    @Override
    public String atacarArañazo() { return nombre + " usó Arañazo!"; }

    @Override
    public String atacarMordisco() { return nombre + " usó Mordisco!"; }

    @Override
    public String atacarHidroBomba() { return nombre + " usó Hidro Bomba!"; }

    @Override
    public String atacarPistolaAgua() { return nombre + " usó Pistola Agua!"; }

    @Override
    public String atacarBurbuja() { return nombre + " usó Burbuja!"; }

    @Override
    public String atacarHidropulso() { return nombre + " usó Hidropulso!"; }
}