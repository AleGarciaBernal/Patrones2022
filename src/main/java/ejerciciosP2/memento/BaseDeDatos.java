package ejerciciosP2.memento;

import java.util.ArrayList;
import java.util.List;

public class BaseDeDatos {

    private List<Persona> personas = new ArrayList<>();
    private String mes;

    public BaseDeDatos(String mes){
        this.personas=personas;
        this.mes=mes;
    }

    public void addPersona(Persona persona){
        personas.add(persona);
    }

    public void showInfo() {
        System.out.println("-------------Lista de Personas agregadas en el mes de "+this.getMes()+"-------------");
        for(int i=0; i<personas.size();i++){
            System.out.println("Persona nro "+i+" :"+personas.get(i).getNombre()+" "+
                    personas.get(i).getCi()+" "+ personas.get(i).getEdad());
            }
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }
}
