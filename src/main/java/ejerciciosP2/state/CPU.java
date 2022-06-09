package ejerciciosP2.state;

public class CPU {

    private int capacidadUsada;

    public CPU() {}

    public int getCapacidadUsada() {
        return capacidadUsada;
    }

    public CPU setCapacidadUsada(int capacidadUsada) {
        this.capacidadUsada = capacidadUsada;
        return this;
    }
    public void showInfo(){
        System.out.println("CPU");
        System.out.println("Capacidad usada: "+capacidadUsada);
    }
}
