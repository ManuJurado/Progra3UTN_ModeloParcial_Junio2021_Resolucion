import java.util.ArrayList;
import java.util.List;
import Aviones.*;

public class Hangar {
    private String nombre;
    private List<Avion> aviones;
    private TipoAvion tipoAvionAdmitido; // Usamos el enum TipoAvion

    public Hangar(String nombre, TipoAvion tipoAvionAdmitido) {
        this.nombre = nombre;
        this.tipoAvionAdmitido = tipoAvionAdmitido;
        this.aviones = new ArrayList<>();
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

    public void agregarAvion(Avion avion) {
        if (avion.getTipoAvion() == tipoAvionAdmitido) {
            aviones.add(avion);
        } else {
            System.out.println("Este tipo de avión no es admitido en este hangar.");
        }
    }

    public void despegarAviones() {
        for (Avion avion : aviones) {
            avion.despegar();
        }
        aviones.clear(); // Opcional: limpiar el hangar después de despegar los aviones
    }
}
