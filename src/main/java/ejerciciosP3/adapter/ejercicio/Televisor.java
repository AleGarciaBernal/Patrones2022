package ejerciciosP3.adapter.ejercicio;

public class Televisor implements ILGHome{

    private int costo;
    private int tiempoGarantia;

    public Televisor(int costo, int tiempoGarantia) {
        this.costo = costo;
        this.tiempoGarantia = tiempoGarantia;
    }

    @Override
    public void costo() {
        System.out.println("El costo del televisor es "+costo);

    }

    @Override
    public void tiempoGarantia() {
        System.out.println("La garantia es de "+tiempoGarantia);



    }
}
