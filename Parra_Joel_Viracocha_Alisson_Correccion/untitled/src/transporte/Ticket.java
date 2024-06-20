package transporte;

public class Ticket {
    private int numero;
    private Ruta ruta;
    private Pasajero pasajero;
    private Servicio servicio;
    private double costo;

    public Ticket(int numero, Ruta ruta, Pasajero pasajero, Servicio servicio, double costo) {
        this.numero = numero;
        this.ruta = ruta;
        this.pasajero = pasajero;
        this.servicio = servicio;
        this.costo = costo;
    }



    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Número: " + numero + ", Ruta: " + ruta + ", Pasajero: " + pasajero + ", Servicio: " + servicio + ", Costo: " + costo;
    }

}
