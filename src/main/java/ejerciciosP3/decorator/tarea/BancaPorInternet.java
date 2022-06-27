package ejerciciosP3.decorator.tarea;

public class BancaPorInternet extends Beneficios {

    boolean enable=false;

    public BancaPorInternet(IBanco banco) {
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
        enable=true;
        System.out.println("Banca Por Internet Activada");
    }
}
