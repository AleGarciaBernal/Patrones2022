package ejerciciosP2.observer;

public class Client {

    public static void main(String []args){

        Propaganda propaganda1=new Propaganda();
        propaganda1.attach(new ClienteTelecel("precios llamadas", new Persona("Juan", 123456)));
        propaganda1.attach(new ClienteTelecel("promociones", new Persona("Daniel", 555)));
        propaganda1.attach(new ClienteTelecel("premios", new Persona("Thalia", 9696)));
        propaganda1.attach(new ClienteTelecel("noticia", new Persona("Shakira", 420420)));
        propaganda1.attach(new ClienteTelecel("promociones", new Persona("Byron", 420420)));


        propaganda1.crearNot(new Notificacion("12.05","promociones"));

    }
}
