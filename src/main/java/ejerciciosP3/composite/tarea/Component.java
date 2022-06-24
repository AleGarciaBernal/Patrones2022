package ejerciciosP3.composite.tarea;

public abstract class Component {

    private String type;
    private String vendedor;
    private String descripcion;
    private int precio;
    private String espacios="";


    public Component(String type) {
        this.type = type;
    }
    public void showInfo(){
        System.out.println("                   ");
        System.out.println(espacios+"Tipo:"+type);
        System.out.println(espacios+"Descripcion: "+descripcion);
        System.out.println(espacios+"Vendedor: "+vendedor);
        System.out.println(espacios+"Precio: "+precio);
    }
    public abstract void operation();
    public abstract void add(Component component);
    public abstract void remove(Component component);
    public abstract Component getChild(int position);

    public void setEspacios(String espacios) {
        this.espacios = espacios;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
