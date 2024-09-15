
import Aviones.*;

public class Main {
    public static void main(String[] args) {
        // Crear un aeropuerto
        Aeropuerto aeropuerto = new Aeropuerto("Aeropuerto Internacional Astor Piazolla", "AINT123", "Mar del Plata", 5);

        // Crear hangares para el aeropuerto
        Hangar hangarComercial = new Hangar("Hangar Comercial", TipoAvion.COMERCIAL, aeropuerto);
        Hangar hangarPrivado = new Hangar("Hangar Privado", TipoAvion.PRIVADO, aeropuerto);
        Hangar hangarCarga = new Hangar("Hangar Carga", TipoAvion.CARGA, aeropuerto);
        Hangar hangarMilitar = new Hangar("Hangar Militar", TipoAvion.MILITAR, aeropuerto);

        // Agregar hangares al aeropuerto
        aeropuerto.agregarHangar(hangarComercial);
        aeropuerto.agregarHangar(hangarPrivado);
        aeropuerto.agregarHangar(hangarCarga);
        aeropuerto.agregarHangar(hangarMilitar);

        // Crear aviones
        Avion avionComercial = new AvionComercial();
        Avion avionPrivado = new AvionPrivado();
        Avion avionDeCarga = new AvionDeCarga();
        Avion avionMilitar = new AvionMilitar();

        // Agregar aviones al aeropuerto
        System.out.println("Agregando aviones al aeropuerto...");// el metodo agregarAvion implementado en aeropuerto, compara el tipo de avion a agregar para poder meterlo en el hangar correspondiente.
        aeropuerto.agregarAvion(avionComercial);
        aeropuerto.agregarAvion(avionPrivado);
        aeropuerto.agregarAvion(avionDeCarga);
        aeropuerto.agregarAvion(avionMilitar);

        // Mostrar detalles de los aviones en los hangares
        System.out.println("Detalles de los aviones en los hangares:");
        hangarComercial.mostrarAvionesEnHangar();
        hangarPrivado.mostrarAvionesEnHangar();
        hangarCarga.mostrarAvionesEnHangar();
        hangarMilitar.mostrarAvionesEnHangar();

        // Sacar aviones del hangar y ponerlos en operación
        System.out.println("\nSacando aviones del hangar...");
        hangarComercial.sacarAvionDelHangar(4);
        hangarPrivado.sacarAvionDelHangar(5);
        hangarCarga.sacarAvionDelHangar(1);
        hangarMilitar.sacarAvionDelHangar(2);

        // Mostrar el estado de los hangares y el aeropuerto después de las operaciones
        System.out.println("\nEstado después de sacar aviones:");
        hangarComercial.mostrarAvionesEnHangar();
        hangarPrivado.mostrarAvionesEnHangar();
        hangarCarga.mostrarAvionesEnHangar();
        hangarMilitar.mostrarAvionesEnHangar();

        System.out.println("\nCantidad de aviones en operación en el aeropuerto: " + aeropuerto.getCantidadAvionesEnOperacion());

        // Despegar y aterrizar aviones
        System.out.println("\nDespegando y aterrizando aviones...");
        aeropuerto.despegarAvion(avionComercial);
        aeropuerto.aterrizarAvion(avionComercial);

        aeropuerto.despegarAvion(avionPrivado);
        aeropuerto.aterrizarAvion(avionPrivado);

        aeropuerto.despegarAvion(avionDeCarga);
        aeropuerto.aterrizarAvion(avionDeCarga);

        aeropuerto.despegarAvion(avionMilitar);
        aeropuerto.aterrizarAvion(avionMilitar);

        // Mostrar detalles adicionales del avión militar
        System.out.println("\nDetalles adicionales del avión militar:");
        if (avionMilitar instanceof AvionMilitar) {
            ((AvionMilitar) avionMilitar).mostrarDetalles();
            ((AvionMilitar) avionMilitar).disparar();
        }
    }
}
