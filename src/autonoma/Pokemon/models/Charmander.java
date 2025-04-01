
package autonoma.Pokemon.models;

/**
 * @author Alejandra
 * @since 2025/03/31
 * @version 1.0
 */
class Charmander extends Pokemon implements PokemonFuego {
    public Charmander() {
        super(4, "Charmander", 8.5, "Primera temporada");
    }

    @Override
    public void atacarPlacaje() {
        System.out.println("Charmander usa Placaje!");
    }

    @Override
    public void atacarAranazo() {
        System.out.println("Charmander usa Arañazo!");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Charmander usa Mordisco!");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Charmander usa Puño Fuego!");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Charmander usa Ascuas!");
    }

    @Override
    public void atacarLanzaLlamas() {
        System.out.println("Charmander usa Lanza Llamas!");
    }
}