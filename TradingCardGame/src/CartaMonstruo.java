public class CartaMonstruo extends Carta{

    private String nombre;
    private int ataque;
    private int defensa;
    private int level;
    private String mode;
    private Boolean atacar;
    private Boolean CambioMode;


    public CartaMonstruo(String nombre, String descripcion, String imagen, int costoEnergia, int puntosDefensa, int cantidadVida, String clasificacion, String nombre1, int ataque, int defensa, int level, String mode, Boolean atacar, Boolean cambioMode) {
        super(nombre, descripcion, imagen, costoEnergia, puntosDefensa, cantidadVida, clasificacion);
        this.nombre = nombre1;
        this.ataque = ataque;
        this.defensa = defensa;
        this.level = level;
        this.mode = mode;
        this.atacar = atacar;
        CambioMode = cambioMode;
    }

    @Override
    public void usarCarta() {

    }

    @Override
    public void cambiarModo() {

    }


}





