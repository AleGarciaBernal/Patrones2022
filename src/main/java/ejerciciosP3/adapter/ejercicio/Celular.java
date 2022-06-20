package ejerciciosP3.adapter.ejercicio;

public class Celular implements ISamsungElectronics{

    private int precio;
    private int tiempoDeVida;

    public Celular(int precio, int tiempoDeVida) {
        this.precio = precio;
        this.tiempoDeVida = tiempoDeVida;
    }

    @Override
    public void precio() {
        System.out.println("El precio del celular es "+precio);

    }

    @Override
    public void tiempoDeVida() {
        System.out.println("El tiempo de vida del celular es "+tiempoDeVida);


    }
}
