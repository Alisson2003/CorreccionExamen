package transporte;



public class Main {
    public static void main(String[] args) {
        // Objetos con valores nulos y seteo posterior
        transporte.Ruta ruta1 = new transporte.Ruta("Quito", "Guayaquil", 20);
        transporte.Pasajero pasajero1 = new transporte.Pasajero("Allison Parra", "12345");
        transporte.Ticket ticket1 = new transporte.Normal(ruta1, pasajero1);

        System.out.println("Ticket con valores seteados:");
        ticket1.imprimirDatos();

        // Objetos con valores iniciales
        transporte.Ruta ruta2 = new transporte.Ruta("Quito", "Puyo", 15);
        transporte.Pasajero pasajero2 = new transporte.Pasajero("Job Viracocha", "67890");
        transporte.Ticket ticket2 = new transporte.VIP(ruta2, pasajero2);

        System.out.println("\nTicket con valores iniciales:");
        ticket2.imprimirDatos();
    }
}
