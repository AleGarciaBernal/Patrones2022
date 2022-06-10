package ejerciciosP2.strategy;

import java.net.PortUnreachableException;
import java.util.ArrayList;
import java.util.List;

public class Tienda {

    private IStrategy strategy;
    private List<Ropa> inventario= new ArrayList<>();
    private String nombre;

    public Tienda(String nombre) {
        this.nombre = nombre;
    }

    public IStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public List<Ropa> getInventario() {
        return inventario;
    }

    public void setInventario(List<Ropa> inventario) {
        this.inventario = inventario;
    }

    public void addRopa(Ropa r){
        inventario.add(r);
    }
    public void execute(){
        strategy.execute(inventario);
    }


}
