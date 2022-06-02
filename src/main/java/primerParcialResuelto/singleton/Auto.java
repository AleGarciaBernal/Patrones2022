package primerParcialResuelto.singleton;

public class Auto {

    private String modelo;
    private int placa;
    private String color;

    public Auto(String modelo,int placa,String color){
        this.modelo=modelo;
        this.placa=placa;
        this.color=color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void pagar(String modelo){
        Cabina.getInstance().pagar(modelo);
        Cabina.getInstance().listaDeAutos.add("Ingreso un auto modelo "+ modelo+ ", de color "+ color+" y placa: "+placa);
        Cabina.getInstance().mostrar();
    }
}


