package ejerciciosP3.adapter.ejercicio;

public class RefriAdapter implements ISamsungElectronics{

    private Refrigerador refrigerador;

    public RefriAdapter(Refrigerador refrigerador) {
        this.refrigerador = refrigerador;
    }

    @Override
    public void precio() {
        refrigerador.costo();
    }

    @Override
    public void tiempoDeVida() {
        refrigerador.tiempoGarantia();

    }
}
