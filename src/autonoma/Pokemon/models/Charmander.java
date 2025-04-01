
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
        return nombre + " uso Placaje!";
    }

    @Override
    public String atacarArañazo() { 
        return nombre + " uso Arañazo!"; 
    }

    @Override
    public String atacarMordisco() { 
        return nombre + " uso Mordisco!"; 
    }
  
    @Override
    public String atacarPunioFuego() { 
        return nombre + " uso Puño Fuego!"; 
    }

    @Override
    public String atacarAscuas() { 
        return nombre + " uso Ascuas!"; 
    }

    @Override
    public String atacarLanzaLlamas() { 
        return nombre + " uso Lanza Llamas!"; 
    }
}