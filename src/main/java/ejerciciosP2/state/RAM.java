package ejerciciosP2.state;

public class RAM {

    private int capacidadUsada;

    public RAM(){}

    public void showInfo(){
        System.out.println("RAM");
        System.out.println("Capacidad usada: "+capacidadUsada);
    }

    public int getCapacidadUsada() {
        return capacidadUsada;
    }

    public RAM setCapacidadUsada(int capacidadUsada) {
        this.capacidadUsada = capacidadUsada;
        return this;
    }
}

