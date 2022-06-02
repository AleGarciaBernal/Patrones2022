package ejerciciosP1.cambioDeMonedas;

public class LibreCambistas {
    private String nombre;
    private int ci;

    public LibreCambistas(String nombre, int ci){
        this.nombre=nombre;
        this.ci=ci;
    }

    public void cambiarBsADolares(int cantidad){
        ManagerCambio.getInstance().bsADolares(cantidad);

    }
    public void cambiarBsAEuros(int cantidad){
        ManagerCambio.getInstance().bsAEuros(cantidad);

    }
    public void cambiarDolaresABs(int cantidad){
        ManagerCambio.getInstance().dolarABs(cantidad);

    }
    public void cambiarEurosABs(int cantidad){
        ManagerCambio.getInstance().euroABs(cantidad);

    }

}
