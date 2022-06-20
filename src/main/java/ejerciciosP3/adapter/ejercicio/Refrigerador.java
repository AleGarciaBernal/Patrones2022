package ejerciciosP3.adapter.ejercicio;

public class Refrigerador implements ILGHome{

    private int costo;
    private int tiempoGarantia;

    public Refrigerador(int costo, int tiempoGarantia) {
        this.costo = costo;
        this.tiempoGarantia = tiempoGarantia;
    }

    @Override
    public void costo() {
        System.out.println("El costo del refrigerador es "+costo);

    }

    @Override
    public void tiempoGarantia() {
        System.out.println("La garantia es de "+tiempoGarantia);



    }
}
