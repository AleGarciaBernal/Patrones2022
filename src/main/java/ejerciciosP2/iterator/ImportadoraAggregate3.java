package ejerciciosP2.iterator;

import java.util.Stack;

public class ImportadoraAggregate3 implements IAggregate {

    private Stack<Automovil> autos;

    public ImportadoraAggregate3(){
        autos=new Stack<>();
    }

    public void aregarDatos(Automovil auto){
        autos.add(auto);
    }

    @Override
    public ImportadoraIterator3 createIterator() {
        return new ImportadoraIterator3(autos);
    }


}
