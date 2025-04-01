package autonoma.Pokemon.models;


class Squirtle extends Pokemon implements PokemonAgua {
    public Squirtle() {
        super(7, "Squirtle", 9.0, "Primera temporada");
    }

    @Override
    public void atacarPlacaje() {
        System.out.println("Squirtle usa Placaje!");
    }

    @Override
    public void atacarAranazo() {
        System.out.println("Squirtle usa Arañazo!");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Squirtle usa Mordisco!");
    }

    @Override
    public void atacarHidroBomba() {
        System.out.println("Squirtle usa Hidro Bomba!");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Squirtle usa Pistola Agua!");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Squirtle usa Burbuja!");
    }

    @Override
    public void atacarHidropulso() {
        System.out.println("Squirtle usa Hidropulso!");
    }
}

