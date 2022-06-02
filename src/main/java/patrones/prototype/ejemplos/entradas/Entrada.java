package patrones.prototype.ejemplos.entradas;


public class Entrada implements IPrototype{

    private Equipo equipoLocal=new Equipo();
    private Equipo equipoVisitante=new Equipo();
    private int numero;
    private String fecha;
    private String lugar;
    private Estadio estadio=new Estadio();
    private int precio;
    private Persona persona=new Persona();

    public Entrada(){}

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public Object clone() {
        Equipo equipoCloneL=new Equipo();
        equipoCloneL.setNombre(this.getEquipoLocal().getNombre());
        equipoCloneL.setRanking(this.getEquipoLocal().getRanking());

        Equipo equipoCloneV=new Equipo();
        equipoCloneV.setNombre(this.getEquipoLocal().getNombre());
        equipoCloneV.setRanking(this.getEquipoLocal().getRanking());

        Persona clonep=new Persona();
        clonep.setNombre(this.getPersona().getNombre());
        clonep.setCi(this.getPersona().getCi());

        Estadio cloneE=new Estadio();
        cloneE.setNombre(this.getEstadio().getNombre());
        cloneE.setCapacidad(this.getEstadio().getCapacidad());

        Entrada clone=new Entrada();
        clone.setFecha(this.getFecha());
        clone.setNumero(this.getNumero());
        clone.setPrecio(this.getPrecio());
        clone.setLugar(this.getLugar());

        clone.setEquipoLocal(equipoCloneL);
        clone.setEquipoLocal(equipoCloneV);
        clone.setPersona(clonep);
        clone.setEstadio(cloneE);

        return clone;


    }

    public void showInfo(){
        System.out.println(equipoLocal.getNombre());
        System.out.println(equipoLocal.getRanking());
        System.out.println(equipoVisitante.getNombre());
        System.out.println(equipoVisitante.getRanking());
        System.out.println(lugar);
        System.out.println(precio);
        System.out.println(persona.getCi());
        System.out.println(persona.getNombre());
        System.out.println(numero);
        System.out.println(fecha);
        System.out.println(estadio);




    }
}
