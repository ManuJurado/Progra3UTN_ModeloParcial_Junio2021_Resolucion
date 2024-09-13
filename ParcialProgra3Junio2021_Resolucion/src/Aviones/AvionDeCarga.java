package Aviones;

import java.util.List;

public class AvionDeCarga extends Avion {
    private double capacidadKilos;
    private List<String> productosTransportados;

    public AvionDeCarga(double capacidadKilos, List<String> productosTransportados) {
        super(TipoAvion.CARGA); // Llama al constructor de Avion con el tipo de avión
        this.capacidadKilos = capacidadKilos;
        this.productosTransportados = productosTransportados;
    }

    @Override
    public void despegar() {
        System.out.println("El avión de carga está despegando.");
    }

    @Override
    public void aterrizar() {
        System.out.println("El avión de carga está aterrizando.");
    }

    @Override
    public void volar() {
        System.out.println("El avión de carga está volando.");
    }

    public void mostrarDetalles() {
        System.out.println("Este es un avión de carga con capacidad de " + capacidadKilos + " kilos.");
        System.out.println("Productos transportados: " + productosTransportados);
    }

    // Metodo específico para descargar el contenido
    public void descargarContenido() {
        System.out.println("Descargando los productos transportados.");
    }

    // Metodo para ingresar (simplemente devuelve true en este caso)
    public boolean puedeIngresar() {
        return true;
    }
}
