package ejerciciosP2.observer;

//CLiente
public interface IObserver {
    void update(String msg,Notificacion notificacion);

    String getPreferencia();
}
