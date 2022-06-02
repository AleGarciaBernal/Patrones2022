package patrones.factoryMethod.ejemplos.helados;

public class Base {

    private String tipoFruta;
    private String nombre;

    public Base(){
    }

    public String getTipoFruta() {
        return tipoFruta;
    }

    public void setTipoFruta(String tipoFruta) {
        this.tipoFruta = tipoFruta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
