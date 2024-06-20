package transporte;

public class Servicio {
    private boolean television;
    private boolean internet;
    private boolean servicioAdicional;

    public Servicio(boolean television, boolean internet, boolean servicioAdicional) {
        this.television = television;
        this.internet = internet;
        this.servicioAdicional = servicioAdicional;
    }


    public boolean isTelevision() {
        return television;
    }

    public void setTelevision(boolean television) {
        this.television = television;
    }

    public boolean isInternet() {
        return internet;
    }

    public void setInternet(boolean internet) {
        this.internet = internet;
    }

    public boolean isServicioAdicional() {
        return servicioAdicional;
    }

    public void setServicioAdicional(boolean servicioAdicional) {
        this.servicioAdicional = servicioAdicional;
    }

    public double getRecargo() {
        double recargo = 0.0;

        if (television) {
            recargo += 0.1; //
        }
        return recargo; //
    }

    @Override
    public String toString() {
        return "Televisión: " + television + ", Internet: " + internet + ", Servicio Adicional: " + servicioAdicional;
    }

}
