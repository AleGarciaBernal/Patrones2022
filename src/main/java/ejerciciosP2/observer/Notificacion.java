package ejerciciosP2.observer;

public class Notificacion {

    private String fecha;
    private String tipo;

    public Notificacion(String fecha, String tipo) {
        this.fecha = fecha;
        this.tipo = tipo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void showInfo(){
        System.out.println("Notificacion de tipo: "+tipo+" fecha: "+fecha);
    }
}
