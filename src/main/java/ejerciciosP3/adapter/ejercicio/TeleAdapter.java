package ejerciciosP3.adapter.ejercicio;

public class TeleAdapter implements ISamsungElectronics{

    private Televisor televisor;

    public TeleAdapter(Televisor televisor) {
        this.televisor = televisor;
    }

    @Override
    public void precio() {
        televisor.costo();

    }

    @Override
    public void tiempoDeVida() {
        televisor.tiempoGarantia();

    }
}
