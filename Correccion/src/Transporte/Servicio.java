package transporte;


public class Servicio extends transporte.Entidad {
    private String tipo;
    private int maletas;
    private double recargo;

    public Servicio(String tipo, int maletas, double recargo) {
        this.tipo = tipo;
        this.maletas = maletas;
        this.recargo = recargo;
    }

    public double getRecargo() {
        return recargo;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Servicio: " + tipo + ", Maletas: " + maletas + ", Recargo: " + recargo);
    }
}
