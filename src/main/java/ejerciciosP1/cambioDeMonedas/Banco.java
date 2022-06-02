package ejerciciosP1.cambioDeMonedas;

public class Banco {
    private String sucursal;

    public Banco(String sucursal){
        this.sucursal=sucursal;
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
