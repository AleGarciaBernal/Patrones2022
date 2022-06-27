package ejerciciosP3.decorator.tarea;

public abstract class Beneficios implements IBanco{

    IBanco banco;

    public Beneficios(IBanco banco) {
        this.banco = banco;
    }

    @Override
    public void showInfo() {
        banco.showInfo();

    }

    @Override
    public int getMonto() {
        return banco.getMonto();
    }

    @Override
    public void setMonto(int monto) {
        banco.setMonto(monto);

    }

    public IBanco getBanco() {
        return banco;
    }

    public void setBanco(IBanco banco) {
        this.banco = banco;
    }
}
