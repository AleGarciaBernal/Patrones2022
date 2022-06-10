package ejerciciosP2.strategy;

import java.util.List;

public class EstrategiaPrimavera implements IStrategy{
    @Override
    public void execute(List<Ropa>ropaList) {
        for (Ropa ropa:ropaList) {
            System.out.println("**************PRECIO***************");
            ropa.showInfo();
        }
    }
}
