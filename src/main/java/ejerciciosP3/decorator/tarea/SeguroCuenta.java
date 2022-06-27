package ejerciciosP3.decorator.tarea;

public class SeguroCuenta extends Beneficios {


    public SeguroCuenta(IBanco banco) {
        super(banco);
    }

    @Override
    public void showInfo(){
        super.showInfo();
        addBehavior();
    }

    @Override
    public int getMonto() {
        return 0;
    }


    @Override
    public void setMonto(int monto) {

    }

    private void addBehavior() {
        System.out.println("Descontando el costo del seguro");
    }
}
