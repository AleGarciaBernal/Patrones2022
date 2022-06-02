package patrones.singleton.ejemplos.banco;

public class BancaMovil {

    private int numeroBancaMovil;

    public BancaMovil(int numeroBancaMovil){
        this.numeroBancaMovil=numeroBancaMovil;
    }

    public int getNumeroBancaMovil() {
        return numeroBancaMovil;
    }

    public void setNumeroBancaMovil(int numeroBancaMovil) {
        this.numeroBancaMovil = numeroBancaMovil;
    }
    public void retirarDineroMovil(int cantidad){
        Cuenta.getInstance().retirarDinero(cantidad);
    }
}
