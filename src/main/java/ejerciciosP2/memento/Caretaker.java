package ejerciciosP2.memento;

import java.util.HashMap;
import java.util.Map;

public class Caretaker {
    // objeto que almacena momentos/stados ---> LIST
    //private List<Memento> stateList = new ArrayList<>();
    //Map<Integer, Automovil> map = new HashMap<Integer, Automovil>();

    private Map<String, Memento> mapaEstados =new HashMap<String, Memento>();


    public void addMemento(String key,Memento m){
        mapaEstados.put(key,m);
    }

    // forma de obtener objetos de nuestro almacenador de datos ---> LIST
    public Memento getMemento(String key){
        return mapaEstados.get(key);
    }
}
