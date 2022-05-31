package ejerciciosP2.iterator;

import java.util.ArrayList;
import java.util.List;

public class ImportadoraAggregate4 implements IAggregate {

    private List<Automovil> autos;

    public ImportadoraAggregate4(){
        autos=new ArrayList<>();
    }

    public void aregarDatos(Automovil auto){
        autos.add(auto);
    }

    @Override
    public Iterator createIterator() {
        return null;
    }
}
