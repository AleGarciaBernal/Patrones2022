package ejerciciosP3.visitor.ejercicio;

public class Viajero implements IVisitor {

    double dineroDolares;
    double dineroMonedaLocal;

    public Viajero(double dineroDolares, double dineroMonedaLocal) {
        this.dineroDolares = dineroDolares;
        this.dineroMonedaLocal = dineroMonedaLocal;
    }

    public double dosDeci(double x){
        return Math.round(x*100.0)/100.0;
    }

    @Override
    public double visitBoliviaBS(Bolivia bolivia) {
        System.out.println("Cambiando "+dineroDolares+ " dolares a Bs.");
        double temp=dosDeci(dineroDolares*bolivia.getCambio());
        return temp;
    }

    @Override
    public double visitBoliviaUSD(Bolivia bolivia) {
        System.out.println("Cambiando "+dineroMonedaLocal+ " bs a Dolares.");
        double temp=dosDeci(dineroMonedaLocal/bolivia.getCambio());
        return temp;
    }

    @Override
    public double visitArgentinaPA(Argentina argentina) {
        System.out.println("Cambiando "+dineroDolares+ " dolares a Pesos Argentinos");
        double temp=dosDeci(dineroDolares*argentina.getCambio());
        return temp;
    }

    @Override
    public double visitArgentinaUSD(Argentina argentina) {
        System.out.println("Cambiando " + dineroMonedaLocal + " pesos a Dolares.");
        double temp=dosDeci(dineroMonedaLocal/argentina.getCambio());
        return temp;    }

    @Override
    public double visitBrasilR(Brasil brasil) {
        System.out.println("Cambiando "+dineroDolares+ " dolares a Reales");
        double temp=dosDeci(dineroDolares*brasil.getCambio());
        return temp;    }

    @Override
    public double visitBrasilUSD(Brasil brasil) {
        System.out.println("Cambiando "+dineroMonedaLocal+ "reales a Dolares.");
        double temp=dosDeci(dineroMonedaLocal/brasil.getCambio());
        return temp;    }

    @Override
    public double visitItaliaEU(Italia italia) {
        System.out.println("Cambiando "+dineroDolares+ " dolares a Euros.");
        double temp=dosDeci(dineroDolares*italia.getCambio());
        return temp;    }

    @Override
    public double visitItaliaUSD(Italia italia) {
        System.out.println("Cambiando "+dineroMonedaLocal+ " euros a Dolares.");
        double temp=dosDeci(dineroMonedaLocal/italia.getCambio());
        return temp;    }


    public double getDineroDolares() {
        return dineroDolares;
    }

    public void setDineroDolares(double dineroDolares) {
        this.dineroDolares = dineroDolares;
    }

    public double getDineroMonedaLocal() {
        return dineroMonedaLocal;
    }

    public void setDineroMonedaLocal(double dineroMonedaLocal) {
        this.dineroMonedaLocal = dineroMonedaLocal;
    }


}
