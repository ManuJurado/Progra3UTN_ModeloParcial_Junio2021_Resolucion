import java.util.List;
import java.util.ArrayList;

import Aviones.*;

public class Hangar {
    private String nombre;
    private List<Avion> aviones;
    private TipoAvion tipoAvionAdmitido;
    private final Aeropuerto aeropuerto; // Referencia al aeropuerto para actualizar cantidadAvionesEnOperacion

    public Hangar(String nombre, TipoAvion tipoAvionAdmitido, Aeropuerto aeropuerto) {
        this.nombre = nombre;
        this.tipoAvionAdmitido = tipoAvionAdmitido;
        this.aviones = new ArrayList<>();
        for (int i = 0; i < 10; i++) { // creo 10 aviones del tipo de avion admitido de forma predeterminada al crear un hangar. Luego podran sacarse o agregarse al mismo, siempre y cuando se respete el tipo de avion

            // Crear el avión del tipo admitido
            Avion avion = switch (tipoAvionAdmitido) {
                case COMERCIAL -> new AvionComercial();
                case PRIVADO -> new AvionPrivado();
                case CARGA -> new AvionDeCarga();
                case MILITAR -> new AvionMilitar();
            };
            this.aviones.add(avion); // Agregar el avión a la lista
        }
        this.aeropuerto = aeropuerto; // Inicializamos la referencia al aeropuerto
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Avion> getAviones() {
        return aviones;
    }

    public void setAviones(List<Avion> aviones) {
        this.aviones = aviones;
    }

    public TipoAvion getTipoAvionAdmitido() {
        return tipoAvionAdmitido;
    }

    public void setTipoAvionAdmitido(TipoAvion tipoAvionAdmitido) {
        this.tipoAvionAdmitido = tipoAvionAdmitido;
    }

    public void agregarAvionAlHangar(Avion avion) {
        if (avion.getTipoAvion() == tipoAvionAdmitido) {
            aviones.add(avion);
            aeropuerto.disminuirCantidadAvionesEnOperacion(); // Disminuir la cantidad de aviones en operación
            System.out.println("Avión agregado al hangar " + nombre + ".");
        } else {
            System.out.println("Este tipo de avión no es admitido en este hangar.");
        }
    }

    public void sacarAvionDelHangar(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            if (!aviones.isEmpty()) {
                // Verificar si se puede aumentar la cantidad de aviones en operación en el aeropuerto
                if (aeropuerto.getCantidadAvionesEnOperacion() < aeropuerto.getCapacidadOperacion()) {
                    aviones.removeFirst(); // Remover el primer avión de la lista (o puedes usar otro criterio)
                    aeropuerto.aumentarCantidadAvionesEnOperacion(); // Aumentar la cantidad de aviones en operación en el aeropuerto
                    System.out.println("Avión sacado del hangar " + nombre + ".");
                } else {
                    System.out.println("Capacidad máxima de operación del aeropuerto alcanzada. No se puede sacar más aviones.");
                    break; // Salir del bucle si no se puede sacar más aviones
                }
            } else {
                System.out.println("No hay aviones en el hangar " + nombre + ".");
                break; // Salir del bucle si ya no hay aviones en el hangar
            }
            System.out.println("Cantidad de aviones " + getTipoAvionAdmitido() + " en el hangar: " + aviones.size());
        }
    }

    // Metodo para mostrar los aviones en el hangar
    public void mostrarAvionesEnHangar() {
        int cantidadAviones = aviones.size();

        if (cantidadAviones == 0) {
            System.out.println("El hangar " + nombre + " está vacío.");
        } else {
            System.out.println("Cantidad total de aviones de tipo " + tipoAvionAdmitido + " en el hangar " + nombre + ": " + cantidadAviones);
        }
    }

}
