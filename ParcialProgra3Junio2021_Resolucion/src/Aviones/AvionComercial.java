package Aviones;
import java.util.List;

// AvionComercial.java
public class AvionComercial extends Avion {
    private int cantidadAzafatas;
    private List<Servicios> servicios;

    public AvionComercial(int cantidadAzafatas, List<Servicios> servicios) {
        super(TipoAvion.COMERCIAL); // Usamos el enum TipoAvion
        this.cantidadAzafatas = cantidadAzafatas;
        this.servicios = servicios;
    }

    @Override
    public void despegar() {
        System.out.println("El avión comercial está despegando.");
    }

    @Override
    public void aterrizar() {
        System.out.println("El avión comercial está aterrizando.");
    }

    @Override
    public void volar() {
        System.out.println("El avión comercial está volando.");
    }

    // Métodos adicionales para AvionComercial
}
