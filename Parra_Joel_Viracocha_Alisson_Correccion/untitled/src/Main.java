package transporte;

public class Main {
    public static void main(String[] args) {
        // Instanciar al menos 5 objetos con valores nulos y posteriormente establecer algunos atributos
        transporte.Ruta ruta1 = new transporte.Ruta(null, null, 0.0);
        ruta1.setOrigen("Quito");
        ruta1.setDestino("Guayaquil");
        ruta1.setPrecio(20.0);

        transporte.Pasajero pasajero1 = new transporte.Pasajero(null, 0);
        pasajero1.setNombre("Joel Parra");
        pasajero1.setEdad(26);

        transporte.Servicio servicio1 = new transporte.Servicio(false, false, false);
        servicio1.setTelevision(true);
        servicio1.setInternet(true);

        transporte.Ticket ticket1 = new transporte.Ticket(0, null, null, null, 0.0);
        ticket1.setNumero(1);
        ticket1.setRuta(ruta1);
        ticket1.setPasajero(pasajero1);
        ticket1.setServicio(servicio1);
        ticket1.setCosto(25.0);

        // Instanciar otros objetos con valores nulos y posteriormente establecer algunos atributos
        transporte.Ruta ruta2 = new transporte.Ruta(null, null, 0.0);
        ruta2.setOrigen("Quito");
        ruta2.setDestino("Puyo");
        ruta2.setPrecio(15.0);

        transporte.Pasajero pasajero2 = new transporte.Pasajero(null, 0);
        pasajero2.setNombre("Lizz Muñoz");
        pasajero2.setEdad(20);

        transporte.Servicio servicio2 = new transporte.Servicio(false, false, false);
        servicio2.setTelevision(false);
        servicio2.setInternet(true);

        transporte.Ticket ticket2 = new transporte.Ticket(0, null, null, null, 0.0);
        ticket2.setNumero(2);
        ticket2.setRuta(ruta2);
        ticket2.setPasajero(pasajero2);
        ticket2.setServicio(servicio2);
        ticket2.setCosto(18.0);


        System.out.println("Primer persona");
        System.out.println("Su ruta es: " + ticket1.getRuta());
        System.out.println("Señor: " + ticket1.getPasajero());
        System.out.println("Servicios ocupados: " + ticket1.getServicio());
        System.out.println("}Valor final: " + ticket1.getCosto());
        System.out.println();

        System.out.println("Segunda persona :");
        System.out.println("Su ruta es:" + ticket2.getRuta());
        System.out.println("Señor: " + ticket2.getPasajero());
        System.out.println("Servicios ocupados: " + ticket2.getServicio());
        System.out.println("}Valor final:" + ticket2.getCosto());
    }
}
