package ejerciciosP3.visitor.ejercicio;

public class Bolivia implements IPais{

    double cambio=6.98;

    public double getCambio() {
        return cambio;
    }

    @Override
    public void accept(IVisitor visitor, boolean dolares) {
        if(dolares){
            System.out.println(visitor.visitBoliviaUSD(this));
        }else {
            System.out.println(visitor.visitBoliviaBS(this));
        }
    }
}
