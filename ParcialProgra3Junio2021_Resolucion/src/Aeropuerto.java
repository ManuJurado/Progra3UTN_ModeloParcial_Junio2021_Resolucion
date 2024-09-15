import java.util.ArrayList;
import java.util.List;

import Aviones.*;

public class Aeropuerto {
    private final String nombre;
    private final String codigoInternacional;
    private final String direccion;
    private final int capacidadOperacion;
    private int cantidadAvionesEnOperacion;
    private final List<Hangar> hangares;

    public Aeropuerto(String nombre, String codigoInternacional, String direccion, int capacidadOperacion) {
        this.nombre = nombre;// nombre del aeropuerto
        this.codigoInternacional = codigoInternacional;// codigo internacional del aeropuerto
        this.direccion = direccion;// direccion fisica del aeropuerto. Se pasa por parametro en el constructor
        this.capacidadOperacion = capacidadOperacion; // la capacidad de operacion debera ser determinada a la hora de crear el aeropuerto, y sera la cantidad maxima de aviones que pueden estar en operacion al mismo tiempo.
        this.cantidadAvionesEnOperacion = 0; // la cantidad de aviones en operacion en el momento de crear el aeropuerto sera siempre 0.
        this.hangares = new ArrayList<>();// Se crea un arralist que determinara los hangares que puede haber en el aeropuerto. No existe un limite de hangares a crear en el mismo.
    }

    public void agregarHangar(Hangar hangar) {// agrega un hangar al aeropuerto. Se debe instanciar antes de agregarlo para determinar el tipo de avion que se le asignara al mismo, asi como los otros datos
        hangares.add(hangar);
    }

    public boolean agregarAvion(Avion avion) {
        if (cantidadAvionesEnOperacion < capacidadOperacion) {
            for (Hangar hangar : hangares) {
                if (hangar.getTipoAvionAdmitido() == avion.getTipoAvion()) {
                    hangar.agregarAvionAlHangar(avion);
                    return true;
                }
            }
            System.out.println("No se pudo agregar el avión. No hay hangares disponibles.");
        } else {
            System.out.println("Capacidad de operación del aeropuerto superada.");
        }
        return false;
    }

    // Metodo para despegar un avión y reducir la cantidad en operación
    public void despegarAvion(Avion avion) {
        if (cantidadAvionesEnOperacion > 0) {
            avion.despegar();
            cantidadAvionesEnOperacion--;
            System.out.println("Cantidad de aviones en operación después del despegue: " + cantidadAvionesEnOperacion);
        } else {
            System.out.println("No hay aviones en operación para despegar.");
        }
    }

    // Metodo para aterrizar un avión y aumentar la cantidad en operación
    public void aterrizarAvion(Avion avion) {
        if (cantidadAvionesEnOperacion < capacidadOperacion) {
            avion.aterrizar();
            cantidadAvionesEnOperacion++;
            System.out.println("Cantidad de aviones en operación después del aterrizaje: " + cantidadAvionesEnOperacion);
        } else {
            System.out.println("No hay espacio suficiente para aterrizar.");
        }
    }

    public int getCantidadAvionesEnOperacion() {
        return cantidadAvionesEnOperacion;
    }

    public void setCantidadAvionesEnOperacion(int cantidadAvionesEnOperacion) {
        this.cantidadAvionesEnOperacion = cantidadAvionesEnOperacion;
    }

    public void aumentarCantidadAvionesEnOperacion() {
        cantidadAvionesEnOperacion++;
    }

    public void disminuirCantidadAvionesEnOperacion() {
        cantidadAvionesEnOperacion--;
    }

    public int getCapacidadOperacion() {
        return capacidadOperacion;
    }

    @Override
    public String toString() {
        return "Aeropuerto{" +
                "nombre='" + nombre + '\'' +
                ", codigoInternacional='" + codigoInternacional + '\'' +
                ", direccion='" + direccion + '\'' +
                ", capacidadOperacion=" + capacidadOperacion +
                ", cantidadAvionesEnOperacion=" + cantidadAvionesEnOperacion +
                ", hangares=" + hangares +
                '}';
    }
}
