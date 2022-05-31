package ejerciciosP2.iterator;

public class ImportadoraAggregate1 implements IAggregate{
    // logica de algun objeto que almacene objetos
    private int position;
    private Automovil [] autos;

    public ImportadoraAggregate1(){
        autos= new Automovil[2];
    }

    public void add (Automovil automovil){
        autos[position]=automovil;
        position++;
    }

    @Override
    public ImportadoraIterator1 createIterator() {
        return new ImportadoraIterator1(autos);
    }
}
