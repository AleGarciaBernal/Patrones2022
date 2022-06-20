package ejerciciosP3.visitor.ejercicio;

public class Italia implements IPais{

    private double cambio=0.95;

    public double getCambio() {
        return cambio;
    }

    public void setCambio(double cambio) {
        this.cambio = cambio;
    }

    @Override
    public void accept(IVisitor visitor, boolean dolares) {
        if(dolares){
            System.out.println(visitor.visitItaliaUSD(this));
        }else {
            System.out.println(visitor.visitItaliaEU(this));
        }
    }
}
