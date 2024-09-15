package Aviones;

import java.util.List;

public class AvionMilitar extends Avion {
    private final List<SistemaArmas> sistemaArmas;
    private static final int CANTIDAD_BALAS_DEFAULT = 100;
    private int cantidadBalas;

    private static final List<SistemaArmas> SISTEMA_ARMAS = List.of(
            SistemaArmas.AIRE_AIRE,
            SistemaArmas.AIRE_TIERRA
    );

    public AvionMilitar() {
        super(TipoAvion.MILITAR); // Llama al constructor de Avion con el tipo de avión
        this.sistemaArmas = SISTEMA_ARMAS;
        this.cantidadBalas = CANTIDAD_BALAS_DEFAULT;
    }

    @Override
    public void despegar() {
        System.out.println("El avión militar está despegando.");
    }

    @Override
    public void aterrizar() {
        System.out.println("El avión militar está aterrizando.");
    }

    @Override
    public void volar() {
        System.out.println("El avión militar está volando.");
    }

    public void mostrarDetalles() {
        System.out.println("Este es un avión militar con sistema de armas " + sistemaArmas + " y " + cantidadBalas + " balas.");
    }

    public void disparar(){
        if(cantidadBalas>=0){
            cantidadBalas--;
            System.out.println("disparo efectuado, " + cantidadBalas+" balas restantes");
        }else{
            System.out.println("No hay mas balas...");
        }
    }

    // Metodo para ingresar (simplemente devuelve true en este caso)
    public boolean puedeIngresar() {
        return true;
    }
}
