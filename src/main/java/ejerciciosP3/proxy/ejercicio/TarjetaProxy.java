package ejerciciosP3.proxy.ejercicio;

import ejerciciosP3.proxy.example.FileServer;

import java.util.ArrayList;
import java.util.List;

public class TarjetaProxy implements ICuenta{

    private Cuenta cuenta;
    private List<Producto> comprasNoConcretadas=new ArrayList<>();

    public TarjetaProxy(Cuenta cuenta){
        this.cuenta=cuenta;

    }

    @Override
    public void comprar(Producto producto) {
        int temp;
        if (producto.getMoneda().equals("euros")) {
            temp = producto.getPrecio() * 8;
            if (cuenta.getBs() >= temp) {
                cuenta.comprar(producto);
                cuenta.setBs(cuenta.getBs() - temp);
            } else {
                System.out.println("Saldo insuficiente para comprar " + producto.getNombre());
                comprasNoConcretadas.add(producto);
            }
        } else if (producto.getMoneda().equals("dolares")) {
            temp = producto.getPrecio() * 7;
            if (cuenta.getBs() >= temp) {
                cuenta.comprar(producto);
                cuenta.setBs(cuenta.getBs() - temp);
            } else {
                comprasNoConcretadas.add(producto);
                System.out.println("Saldo insuficiente para comprar " + producto.getNombre());
            }
        } else {
            if (cuenta.getBs() >= producto.getPrecio()) {
                cuenta.comprar(producto);
                cuenta.setBs(cuenta.getBs() - producto.getPrecio());
            }else {
                comprasNoConcretadas.add(producto);
                System.out.println("Saldo insuficiente para comprar " + producto.getNombre());
            }

        }
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public List<Producto> getComprasNoConcretadas() {
        return comprasNoConcretadas;
    }

    public void setComprasNoConcretadas(List<Producto> comprasNoConcretadas) {
        this.comprasNoConcretadas = comprasNoConcretadas;
    }
    public void showProductosNoComprados(){
        System.out.println("-------------------------");
        System.out.println("Lista de Productos no comprados");
        for (Producto p:comprasNoConcretadas) {
            p.showInfo();

        }
    }
}
