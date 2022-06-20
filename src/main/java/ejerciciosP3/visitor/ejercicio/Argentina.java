package ejerciciosP3.visitor.ejercicio;

public class Argentina implements IPais {

    private double cambio=123.11;

    public double getCambio() {
        return cambio;
    }

    public void setCambio(double cambio) {
        this.cambio = cambio;
    }

    @Override
    public void accept(IVisitor visitor, boolean dolares) {
        if(dolares){
            System.out.println(visitor.visitArgentinaUSD(this));
        }else {
            System.out.println(visitor.visitArgentinaPA(this));
        }
    }
}
