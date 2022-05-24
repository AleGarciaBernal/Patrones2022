package ejercicios.pasajesAbstract;

public class Client {

    public static void main(String []args){
        Pasaje pasaje= FactoryPasaje.make("standar");
        pasaje.showInfo();


    }

}
