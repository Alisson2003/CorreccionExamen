package transporte;



public class Normal extends Ticket {
    public Normal(Ruta ruta, Pasajero pasajero) {
        super(ruta, pasajero, new transporte.Servicio("Normal", 1, 0));
    }
}
