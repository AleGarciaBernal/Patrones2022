package ejerciciosP2.strategy;

import java.util.List;

public class EstrategiaOtonio implements IStrategy{
    @Override
    public void execute(List<Ropa>ropaList) {
        for (Ropa ropa:ropaList) {
            System.out.println("**************Precio Original*************");
            ropa.showInfo();
            System.out.println("**************Precio De Temporada*************");
            ropa.setPrecio(ropa.getPrecio()/2);
            ropa.showInfo();
        }
    }
}
