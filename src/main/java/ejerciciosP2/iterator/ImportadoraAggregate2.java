package ejerciciosP2.iterator;

import java.util.Vector;

public class ImportadoraAggregate2 implements IAggregate {

    private Vector<Automovil>autos;
    private int posicion;

    public ImportadoraAggregate2(){
        autos=new Vector<>();
    }

    public void aregarDatos(Automovil auto){
        autos.add(auto);
    }

    @Override
    public ImportadoraIterator2 createIterator() {
        return new ImportadoraIterator2(autos);
    }


}
