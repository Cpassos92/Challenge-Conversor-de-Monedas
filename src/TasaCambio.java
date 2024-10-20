public class TasaCambio {
    private String monedaBase;
    private String monedaDestino;
    private double tasa;

    // Constructor
    public TasaCambio(String monedaBase, String monedaDestino, double tasa) {
        this.monedaBase = monedaBase;
        this.monedaDestino = monedaDestino;
        this.tasa = tasa;
    }

    // Getters
    public String getMonedaBase() {
        return monedaBase;
    }

    public String getMonedaDestino() {
        return monedaDestino;
    }

    public double getTasa() {
        return tasa;
    }

    // Método para convertir una cantidad
    public double convertir(double cantidad) {
        return cantidad * tasa;
    }

    @Override
    public String toString() {
        return "1 " + monedaBase + " = " + tasa + " " + monedaDestino;
    }
}
