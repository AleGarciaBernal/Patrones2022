package ejerciciosP2.mediator;

import java.util.HashMap;

import java.util.Map;

public class Skype implements ICanalDeComunicacion{

    Map<Integer, Profesional> profesionalChat = new HashMap<Integer, Profesional>();

    private int posicion=1 ;

    public Skype addProfesionalChat(Profesional profesional){
        profesionalChat.put(posicion,profesional);
        posicion++;
        return this;
    }

    @Override
    public void send(String msg, Persona persona) {
        Profesional emisor = (Profesional) persona;
        for ( int key : profesionalChat.keySet()) {
            if (!emisor.getCi().equals(profesionalChat.get(key).getCi())){
                if(emisor.getCargo().equals("QA") && profesionalChat.get(key).getCargo().equals("QA")){
                    profesionalChat.get(key).received(msg);
                }else if (emisor.getCargo().equals("DEV") && profesionalChat.get(key).getCargo().equals("DEV")){
                    profesionalChat.get(key).received(msg);
                }else if (emisor.getCargo().equals("SM")){
                    profesionalChat.get(key).received(msg);
                }
            }
        }

    }
}
