package ejerciciosP2.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ImportadoraIterator4 implements Iterator{

    private List<Automovil> autos;
    private int posicion;

    public ImportadoraIterator4(Stack<Automovil> autos){
        this.autos=autos;
    }

    @Override
    public Object next() {
        return autos.get(posicion++);
    }

    @Override
    public boolean hasNext() {
        return autos.size() != 0 && posicion < autos.size();
    }
}
