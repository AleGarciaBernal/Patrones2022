package ejerciciosP3.proxy.ejercicio;

import java.util.ArrayList;
import java.util.List;

public class Cuenta implements ICuenta{

    private Persona persona;
    private int bs;
    private List<Producto> productosComprados=new ArrayList<>();

    public Cuenta(Persona persona, int bs) {
        this.persona = persona;
        this.bs = bs;
    }

    @Override
    public void comprar(Producto producto) {
        productosComprados.add(producto);
        System.out.println("Usted compro: "+ producto.getNombre()+" a "+producto.getPrecio()+" "+producto.getMoneda());
        System.out.println("---------------------------------------");
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public int getBs() {
        return bs;
    }

    public void setBs(int bs) {
        this.bs = bs;
    }

    public List<Producto> getProductosComprados() {
        return productosComprados;
    }

    public void setProductosComprados(List<Producto> productosComprados) {
        this.productosComprados = productosComprados;
    }
    public void showInfo(){
        System.out.println("Persona: "+persona.getNombre());
        System.out.println("Saldo: "+this.bs);

    }
    public void showProductos(){
        System.out.println("----------Productos Comprados---------");
        for (Producto producto:productosComprados) {
            producto.showInfo();
        }
    }

}
