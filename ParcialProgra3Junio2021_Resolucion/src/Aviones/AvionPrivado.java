package Aviones;

public class AvionPrivado extends Avion {
    private boolean tieneJacuzzi;
    private String claveWifi;

    public AvionPrivado(boolean tieneJacuzzi, String claveWifi) {
        super(TipoAvion.PRIVADO); // Llama al constructor de Avion con el tipo de avión
        this.tieneJacuzzi = tieneJacuzzi;
        this.claveWifi = claveWifi;
    }

    @Override
    public void despegar() {
        System.out.println("El avión privado está despegando.");
    }

    @Override
    public void aterrizar() {
        System.out.println("El avión privado está aterrizando.");
    }

    @Override
    public void volar() {
        System.out.println("El avión privado está volando.");
    }

    public void mostrarDetalles() {
        System.out.println("Este es un avión privado.");
        System.out.println("Jacuzzi: " + (tieneJacuzzi ? "Sí" : "No"));
        System.out.println("Clave de Wifi: " + claveWifi);
    }

    // Método específico para ver el mundial
    public boolean puedeVerMundial() {
        return true; // Siempre es verdadero para los aviones privados
    }
}
