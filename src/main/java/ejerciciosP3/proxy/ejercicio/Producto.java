package ejerciciosP3.proxy.ejercicio;

public class Producto {

    private String nombre;
    private int precio;
    private String moneda;

    public Producto(String nombre, int precio, String moneda) {
        this.nombre = nombre;
        this.precio = precio;
        this.moneda = moneda;
    }

    public void showInfo(){
        System.out.println("Nombre del producto: "+nombre);
        System.out.println("Precio: "+precio+" " +moneda);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }
}
