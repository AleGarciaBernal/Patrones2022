package ejerciciosP3.visitor.ejercicio;

public class Brasil implements IPais{

    private double cambio=5.15;

    public double getCambio() {
        return cambio;
    }

    public void setCambio(double cambio) {
        this.cambio = cambio;
    }

    @Override
    public void accept(IVisitor visitor, boolean dolares) {
        if(dolares){
            System.out.println(visitor.visitBrasilUSD(this));
        }else {
            System.out.println(visitor.visitBrasilR(this));
        }
    }
}
