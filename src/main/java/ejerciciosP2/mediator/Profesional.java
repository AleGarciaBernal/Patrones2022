package ejerciciosP2.mediator;

public class Profesional extends Persona{

    public Profesional(ICanalDeComunicacion canalComunication) {
        super(canalComunication);
    }

    @Override
    public void send(String msg) {
        canalComunication.send(msg,this);
    }

    @Override
    public void received(String msg) {
        System.out.println("INFO-->cargo: "+getCargo()+ " ci: "+getCi()+" name: "+getName());
        System.out.println("INFO--> received "+msg);
    }
}
