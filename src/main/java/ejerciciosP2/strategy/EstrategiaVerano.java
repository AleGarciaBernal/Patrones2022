package ejerciciosP2.strategy;

import java.util.List;

public class EstrategiaVerano implements IStrategy{
    @Override
    public void execute(List<Ropa>ropaList) {
        for (Ropa ropa:ropaList) {
            int porcentaje= (int)(ropa.getPrecio()*(10.0f/100.0f));
            System.out.println("**************Precio Original*************");
            ropa.showInfo();
            System.out.println("10%="+porcentaje);
            System.out.println("**************Precio de temporada*************");
            ropa.setPrecio(ropa.getPrecio()-porcentaje);
            ropa.showInfo();

        }
    }
}
