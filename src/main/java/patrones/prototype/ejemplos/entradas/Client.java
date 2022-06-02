package patrones.prototype.ejemplos.entradas;

public class Client {

    public static void main(String[]args){
        Estadio hernandoSiles=new Estadio();
        hernandoSiles.setNombre("Hernando Siles");
        hernandoSiles.setCapacidad(1200);

        Equipo local= new Equipo();
        local.setNombre("Bolivia");
        local.setRanking(2);

        Equipo vis=new Equipo();
        vis.setRanking(50);
        vis.setNombre("Brasil");

        Entrada template =new Entrada();
        template.setEstadio(hernandoSiles);
        template.setEquipoLocal(local);
        template.setEquipoVisitante(vis);
        template.setNumero(5555);
        template.setFecha("21 05");
        template.setPrecio(125);
        template.setLugar("La Paz");

        Persona p= new Persona();
        p.setCi(155555852);
        p.setNombre("ALeee");

        Entrada entrada1=(Entrada) template.clone();
        entrada1.setNumero(55);
        entrada1.setPersona(p);

        Entrada entrada2=(Entrada) entrada1.clone();
        entrada2.setNumero(56);
        entrada2.setPersona(p);

        Entrada entrada3=(Entrada) entrada1.clone();
        entrada3.setNumero(57);
        entrada3.setPersona(p);

        entrada1.showInfo();
        entrada2.showInfo();
        entrada3.showInfo();





    }
}
