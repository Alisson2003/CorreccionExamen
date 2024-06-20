package transporte;


public class Ticket extends transporte.Entidad {
    protected transporte.Ruta ruta;
    protected transporte.Pasajero pasajero;
    protected transporte.Servicio servicio;
    protected double costo;

    public Ticket(transporte.Ruta ruta, transporte.Pasajero pasajero, transporte.Servicio servicio) {
        this.ruta = ruta;
        this.pasajero = pasajero;
        this.servicio = servicio;
        this.costo = calcularCosto();
    }

    public double calcularCosto() {
        return ruta.getCosto() + servicio.getRecargo();
    }

    @Override
    public void imprimirDatos() {
        ruta.imprimirDatos();
        pasajero.imprimirDatos();
        servicio.imprimirDatos();
        System.out.println("Costo total del ticket: " + costo);
    }
}
