package transporte;



public class Pasajero extends transporte.Entidad {
    private String nombre;
    private String id;

    public Pasajero(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Pasajero: " + nombre + ", ID: " + id);
    }
}
