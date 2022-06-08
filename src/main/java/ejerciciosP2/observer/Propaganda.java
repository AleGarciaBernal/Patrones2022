package ejerciciosP2.observer;

import java.util.ArrayList;
import java.util.List;

public class Propaganda implements ISubject{

    private List<Notificacion> notList=new ArrayList<>();
    private List<IObserver>clientList=new ArrayList<>();

    public void crearNot(Notificacion notificacion){
        notList.add(notificacion);
        notifyObservers("Nueva Notificacion", notificacion);

    }

    @Override
    public void attach(IObserver observer) {
        clientList.add(observer);

    }

    @Override
    public void detach(IObserver observer) {
        clientList.remove(observer);
    }

    @Override
    public void notifyObservers(String msg, Notificacion notificacion) {
        for (IObserver observer:clientList) {
            if(observer.getPreferencia().equals(notificacion.getTipo())){
                observer.update("Notificacion Nueva!!",notificacion);
            }
            
        }
    }
}
