package patrones.factoryMethod.ejemplos.helados;

public class HeladoMixto implements IHelados {

    private String size;
    private String forma;
    private Fruta fruta;
    private Base base;
    private Crema crema;
    private String costo;

    @Override
    public void showInfo() {
        System.out.println(size);

    }

    public HeladoMixto(Fruta fruta, Base base, Crema crema){
        this.base=base;
        this.fruta=fruta;
        this.crema=crema;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public Fruta getFruta() {
        return fruta;
    }

    public void setFruta(Fruta fruta) {
        this.fruta = fruta;
    }

    public Base getBase() {
        return base;
    }

    public void setBase(Base base) {
        this.base = base;
    }

    public Crema getCrema() {
        return crema;
    }

    public void setCrema(Crema crema) {
        this.crema = crema;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }
}
