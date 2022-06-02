package patrones.factoryMethod.ejemplos.helados;

public class Crema {

    private String sabor;
    private String marca;

    public Crema(){}

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
