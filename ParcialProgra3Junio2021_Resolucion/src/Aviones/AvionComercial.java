package Aviones;
import java.util.List;
import java.util.ArrayList;

// AvionComercial.java
public class AvionComercial extends Avion {
    private final int cantidadAzafatas;
    private static final List<Servicios> SERVICIOS = List.of(
            Servicios.WIFI,
            Servicios.COMIDA,
            Servicios.ENTRETENIMIENTO,
            Servicios.ASIENTO_RECLINABLE,
            Servicios.BEBIDAS
    );
    private final List<Servicios> servicios;

    public AvionComercial() {
        super(TipoAvion.COMERCIAL); // Usamos el enum TipoAvion
        this.cantidadAzafatas = 5;
        this.servicios = new ArrayList<>(SERVICIOS); // Usar la constante SERVICIOS
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

    @Override
    public String toString() {
        return "AvionComercial{" +
                "cantidadAzafatas=" + cantidadAzafatas +
                ", servicios=" + servicios +
                ", tipoAvion=" + tipoAvion +
                '}';
    }

    // Métodos adicionales para AvionComercial
}
