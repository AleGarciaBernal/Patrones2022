package ejercicios.pasajeFactoryMethod;

public class Avion {

    private String marca;
    private int capaciad;
    private String modelo;
    private int nroDeAsientos;

    public Avion(){}

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapaciad() {
        return capaciad;
    }

    public void setCapaciad(int capaciad) {
        this.capaciad = capaciad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNroDeAsientos() {
        return nroDeAsientos;
    }

    public void setNroDeAsientos(int nroDeAsientos) {
        this.nroDeAsientos = nroDeAsientos;
    }
}

