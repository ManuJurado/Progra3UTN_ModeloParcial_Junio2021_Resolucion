package Aviones;

public class AvionMilitar extends Avion {
    private SistemaArmas sistemaArmas;
    private int cantidadBalas;

    public AvionMilitar(SistemaArmas sistemaArmas, int cantidadBalas) {
        super(TipoAvion.MILITAR); // Llama al constructor de Avion con el tipo de avión
        this.sistemaArmas = sistemaArmas;
        this.cantidadBalas = cantidadBalas;
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

    // Metodo para ingresar (simplemente devuelve true en este caso)
    public boolean puedeIngresar() {
        return true;
    }
}
