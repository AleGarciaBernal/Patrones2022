package ejerciciosP2.strategy;

public class Ropa {

    private String tipo;
    private int precio;

    public Ropa(String tipo, int precio) {
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void showInfo(){
        System.out.println("Tipo: "+tipo+", Precio: "+ precio);
    }


}

