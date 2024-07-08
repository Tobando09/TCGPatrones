public abstract class Carta {
    protected String nombre;
    protected String descripcion;
    protected String imagen;
    protected int costoEnergia;
    protected int puntosDefensa;
    protected int cantidadVida;
    protected String clasificacion;

    public Carta() {
    }

    public Carta(String nombre, String descripcion, String imagen, int costoEnergia, int puntosDefensa, int cantidadVida, String clasificacion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.costoEnergia = costoEnergia;
        this.puntosDefensa = puntosDefensa;
        this.cantidadVida = cantidadVida;
        this.clasificacion = clasificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getCostoEnergia() {
        return costoEnergia;
    }

    public void setCostoEnergia(int costoEnergia) {
        this.costoEnergia = costoEnergia;
    }

    public int getPuntosDefensa() {
        return puntosDefensa;
    }

    public void setPuntosDefensa(int puntosDefensa) {
        this.puntosDefensa = puntosDefensa;
    }

    public int getCantidadVida() {
        return cantidadVida;
    }

    public void setCantidadVida(int cantidadVida) {
        this.cantidadVida = cantidadVida;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public abstract void usarCarta();
    public abstract void cambiarModo();


}


