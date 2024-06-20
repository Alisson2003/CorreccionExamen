package transporte;



public class VIP extends transporte.Ticket {
    public VIP(transporte.Ruta ruta, transporte.Pasajero pasajero) {
        super(ruta, pasajero, new transporte.Servicio("VIP", 2, ruta.getCosto() * 0.3));
    }
}
