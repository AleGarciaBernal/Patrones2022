package ejerciciosP2.iterator;

import java.util.Vector;

public class ImportadoraIterator2 implements Iterator{

    private Vector<Automovil> autos;
    private int posicion;

    public ImportadoraIterator2(Vector<Automovil> autos){
        this.autos=autos;
    }

    @Override
    public Object next() {
        return autos.get(posicion++);
    }

    @Override
    public boolean hasNext() {
        return autos.size() !=0 && posicion<autos.size();

    }
}
