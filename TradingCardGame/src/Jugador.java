import java.util.ArrayList;

public class Jugador {
    private String nombreUsuario;
    private String contraseña;
    private ArrayList<Carta> Deck;
    private int cCoins;
    private ArrayList<String> objetivosEspeciales;

    public Jugador(String nombreUsuario, String contraseña) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.Deck = new ArrayList<>();
        this.cCoins = 0;
        this.objetivosEspeciales = new ArrayList<>();
    }

    public void agregarCarta(Carta carta) {
        if (Deck.size() < 50) {
            Deck.add(carta);
        }
    }

    public void eliminarCarta(Carta carta) {
        Deck.remove(carta);
    }

    public void completarObjetivo(String objetivo) {
        if (objetivosEspeciales.contains(objetivo)) {
            objetivosEspeciales.remove(objetivo);
            cCoins += 25; // Recompensa por completar el objetivo
        }
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public ArrayList<Carta> getDeck() {
        return Deck;
    }

    public void setDeck(ArrayList<Carta> deck) {
        Deck = deck;
    }

    public int getcCoins() {
        return cCoins;
    }

    public void setcCoins(int cCoins) {
        this.cCoins = cCoins;
    }

    public ArrayList<String> getObjetivosEspeciales() {
        return objetivosEspeciales;
    }

    public void setObjetivosEspeciales(ArrayList<String> objetivosEspeciales) {
        this.objetivosEspeciales = objetivosEspeciales;
    }
}
