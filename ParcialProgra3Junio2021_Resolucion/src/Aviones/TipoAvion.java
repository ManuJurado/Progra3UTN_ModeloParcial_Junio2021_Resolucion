package Aviones;

public enum TipoAvion {
    COMERCIAL("AvionComercial"),
    PRIVADO("AvionPrivado"),
    CARGA("AvionDeCarga"),
    MILITAR("AvionMilitar");

    private final String claseAvion;

    TipoAvion(String claseAvion) {
        this.claseAvion = claseAvion;
    }

    public String getClaseAvion() {
        return claseAvion;
    }
}
