package Aviones;

public abstract class Avion {
    protected TipoAvion tipoAvion; // Usamos el enum TipoAvion en lugar de String

    public Avion(TipoAvion tipoAvion) {
        this.tipoAvion = tipoAvion;
    }

    public TipoAvion getTipoAvion() {
        return tipoAvion;
    }

    public abstract void despegar();
    public abstract void aterrizar();
    public abstract void volar();
}
