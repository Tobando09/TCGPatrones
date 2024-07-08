import java.io.IOException;

public class Player {
    private final String name;
    private int PuntosDeVida;


    public Player(String name) throws IOException, UnexpectedFormatException {
        this.name = name;
        this.PuntosDeVida = 8000;

    }
}