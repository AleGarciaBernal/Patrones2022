package ejerciciosP2.observer;

public class ClienteTelecel implements IObserver{

    String preferencia;
    Persona persona;

    public ClienteTelecel(String preferencia, Persona persona) {
        this.preferencia = preferencia;
        this.persona = persona;
    }

    public void setPreferencia(String preferencia) {
        this.preferencia = preferencia;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public void update(String msg, Notificacion notificacion) {
        System.out.println("Soy: "+ persona.getNombre()+" y me llego not de tipo: "+preferencia);
        notificacion.showInfo();

    }

    @Override
    public String getPreferencia() {
        return preferencia;
    }
}
