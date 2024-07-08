import java.util.ArrayList;
import java.util.Random;

public class Juego {
    private ArrayList<Jugador> jugadores;
    private int rondas;
    private Random dado;

    public Juego() {
        this.jugadores = new ArrayList<>();
        this.rondas = 10;
        this.dado = new Random();
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public void iniciarJuego() {

        for (Jugador jugador : jugadores) {

        }

        for (int i = 0; i < rondas; i++) {

        }
    }

    public int tirarDados() {
        return dado.nextInt(6) + 1 + dado.nextInt(6) + 1;
    }


}
