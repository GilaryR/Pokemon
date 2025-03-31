
package autonoma.Pokemon.models;

/**
 * @author Alejandra
 * @since 2025/03/31
 * @version 1.0
 */
public class Charmander extends Pokemon implements PokemonFuego {
    public Charmander(int numPokedex, String nombre, double peso, String temporada) {
        super(numPokedex, nombre, peso, temporada);
    }

    @Override
    public String atacarPlacaje() {
        return nombre + " usó Placaje!"; 
    }

    @Override
    public String atacarArañazo() { 
        return nombre + " usó Arañazo!"; 
    }

    @Override
    public String atacarMordisco() { 
        return nombre + " usó Mordisco!"; 
    }

    @Override
    public String atacarPuñoFuego() { 
        return nombre + " usó Puño Fuego!"; 
    }

    @Override
    public String atacarAscuas() { 
        return nombre + " usó Ascuas!";
    }

    @Override
    public String atacarLanzaLlamas() { 
        return nombre + " usó Lanza Llamas!"; 
    }
}