package ejerciciosP1.cambioDeMonedas;

public class CasaDeCambios {
    private String nombre;

    public CasaDeCambios(String nombre){
        this.nombre=nombre;
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
