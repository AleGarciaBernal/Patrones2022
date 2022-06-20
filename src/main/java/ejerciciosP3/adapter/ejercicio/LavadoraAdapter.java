package ejerciciosP3.adapter.ejercicio;

public class LavadoraAdapter implements ISamsungElectronics{

    private Lavadora lavadora;

    public LavadoraAdapter(Lavadora lavadora) {
        this.lavadora = lavadora;
    }

    @Override
    public void precio() {
        lavadora.costo();

    }

    @Override
    public void tiempoDeVida() {
        lavadora.tiempoGarantia();

    }
}
