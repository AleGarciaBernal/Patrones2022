package patrones.singleton.ejemplos.banco;

public class Banco {

    private String sucursal;

    public Banco(String sucursal){
        this.sucursal=sucursal;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public void retirarDineroBanco(int cantidad){
        Cuenta.getInstance().retirarDinero(cantidad);
    }
}
