package ejerciciosP3.adapter.ejercicio;

public class Computadora implements ISamsungElectronics{

    private int precio;
    private int tiempoDeVida;

    public Computadora(int precio, int tiempoDeVida) {
        this.precio = precio;
        this.tiempoDeVida = tiempoDeVida;
    }

    @Override
    public void precio() {

        System.out.println("El precio de la computadora es "+precio);
    }

    @Override
    public void tiempoDeVida() {
        System.out.println("El tiempo de vida de la computadora es "+tiempoDeVida);


    }
}
