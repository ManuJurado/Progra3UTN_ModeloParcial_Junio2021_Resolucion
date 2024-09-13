import Aviones.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Crear enums de servicios
        Servicios[] serviciosComerciales = {Servicios.WIFI, Servicios.COMIDA, Servicios.ENTRETENIMIENTO};

        // Crear aviones
        AvionComercial avionComercial = new AvionComercial(5, Arrays.asList(serviciosComerciales));
        AvionPrivado avionPrivado = new AvionPrivado(true, "ABC123");
        AvionDeCarga avionDeCarga = new AvionDeCarga(2000, Arrays.asList("Electrónica", "Ropa"));

        // Crear hangares
        Hangar hangarComercial = new Hangar("Hangar Comercial", TipoAvion.COMERCIAL);
        Hangar hangarPrivado = new Hangar("Hangar Privado", TipoAvion.PRIVADO);
        Hangar hangarCarga = new Hangar("Hangar Carga", TipoAvion.CARGA);

        // Crear aeropuerto
        Aeropuerto aeropuerto = new Aeropuerto("Aeropuerto Internacional Astor Piazolla", "AIA", "Mar del Plata", 10);

        // Agregar hangares al aeropuerto
        aeropuerto.agregarHangar(hangarComercial);
        aeropuerto.agregarHangar(hangarPrivado);
        aeropuerto.agregarHangar(hangarCarga);

        // Agregar aviones al aeropuerto
        System.out.println("Intentando agregar aviones al aeropuerto:");
        aeropuerto.agregarAvion(avionComercial);
        aeropuerto.agregarAvion(avionPrivado);
        aeropuerto.agregarAvion(avionDeCarga);

        // Mostrar el estado de los hangares antes del despegue
        System.out.println("\nAviones en hangares antes del despegue:");
        hangarComercial.despegarAviones(); // Opcional: puedes imprimir el estado del hangar antes del despegue
        hangarPrivado.despegarAviones(); // Opcional: puedes imprimir el estado del hangar antes del despegue
        hangarCarga.despegarAviones(); // Opcional: puedes imprimir el estado del hangar antes del despegue

        // Hacer despegar aviones de un hangar específico
        System.out.println("\nDespegando aviones del hangar de carga:");
        aeropuerto.despegarAvionesDeHangar(hangarCarga);

        // Mostrar el estado de los hangares después del despegue
        System.out.println("\nAviones en hangares después del despegue:");
        hangarComercial.despegarAviones(); // Opcional: puedes imprimir el estado del hangar después del despegue
        hangarPrivado.despegarAviones(); // Opcional: puedes imprimir el estado del hangar después del despegue
        hangarCarga.despegarAviones(); // Opcional: puedes imprimir el estado del hangar después del despegue
    }
}
