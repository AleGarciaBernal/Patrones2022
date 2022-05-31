package ejerciciosP2.iterator;

import java.util.Stack;

public class ImportadoraIterator3 implements Iterator{

    private Stack<Automovil> autos;
    private int posicion;

    public ImportadoraIterator3(Stack<Automovil> autos){
        this.autos=autos;
    }

    @Override
    public Object next() {
        return autos.get(posicion++);
    }

    @Override
    public boolean hasNext() {
       return autos.size() != 0 && posicion<autos.size();
    }
}
