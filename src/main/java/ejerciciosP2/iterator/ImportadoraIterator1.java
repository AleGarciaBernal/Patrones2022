package ejerciciosP2.iterator;

public class ImportadoraIterator1 implements Iterator{

    private int position;
    private Automovil[]autos;

    public ImportadoraIterator1(Automovil [] autos){
         this.autos=autos;
    }

    @Override
    public Object next() {
        return autos[position++];
    }

    @Override
    public boolean hasNext() {
        return autos.length != 0 && position < autos.length;
    }
}
