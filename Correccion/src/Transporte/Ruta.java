package transporte;


public class Ruta extends transporte.Entidad {
    private String origen;
    private String destino;
    private double costo;

    public Ruta(String origen, String destino, double costo) {
        this.origen = origen;
        this.destino = destino;
        this.costo = costo;
    }

    public double getCosto() {
        return costo;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Ruta: " + origen + " - " + destino + ", Costo: " + costo);
    }
}
