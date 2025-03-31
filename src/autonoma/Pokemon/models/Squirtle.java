package autonoma.Pokemon.models;

/**
 * @author Alejandra
 * @since 2025/03/31
 * @version 1.0
 */
public class Squirtle implements Pokemon, PokemonAgua {
    @Override
    public void atacar() {
        System.out.println("Squirtle usa Pistola de Agua!");
    }

    @Override
    public void defender() {
        System.out.println("Squirtle se esconde en su caparazón.");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Squirtle lanza un chorro de agua a alta presión!");
    }
}

