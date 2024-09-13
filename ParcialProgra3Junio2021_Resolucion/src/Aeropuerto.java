import Aviones.*;

import java.util.ArrayList;
import java.util.List;

public class Aeropuerto {
    private String nombre;
    private String codigoInternacional;
    private String direccion;
    private int capacidadOperacion;
    private int cantidadAvionesEnOperacion;
    private List<Hangar> hangares;

    public Aeropuerto(String nombre, String codigoInternacional, String direccion, int capacidadOperacion) {
        this.nombre = nombre;
        this.codigoInternacional = codigoInternacional;
        this.direccion = direccion;
        this.capacidadOperacion = capacidadOperacion;
        this.cantidadAvionesEnOperacion = 0;
        this.hangares = new ArrayList<>();
    }

    public void agregarHangar(Hangar hangar) {
        hangares.add(hangar);
    }

    public boolean agregarAvion(Avion avion) {
        if (cantidadAvionesEnOperacion < capacidadOperacion) {
            for (Hangar hangar : hangares) {
                if (hangar.getTipoAvionAdmitido() == avion.getTipoAvion()) {
                    hangar.agregarAvion(avion);
                    cantidadAvionesEnOperacion++;
                    return true;
                }
            }
            System.out.println("No se pudo agregar el avión: todos los hangares están llenos o no admiten el tipo de avión.");
        } else {
            System.out.println("Capacidad de operación del aeropuerto superada.");
        }
        return false;
    }

    public void despegarAvionesDeHangar(Hangar hangar) {
        hangar.despegarAviones();
        // Se asume que se reduce la cantidad de aviones en operación si se despegan
        cantidadAvionesEnOperacion -= hangar.getAviones().size();
    }
}
