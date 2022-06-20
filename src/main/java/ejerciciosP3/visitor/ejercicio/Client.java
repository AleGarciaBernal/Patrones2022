package ejerciciosP3.visitor.ejercicio;

public class Client {

    public static void main(String[]args){
        Viajero viajero= new Viajero(150,330);


        Bolivia bolivia= new Bolivia();
        Italia italia= new Italia();
        Argentina argentina=new Argentina();
        Brasil brasil=new Brasil();



        bolivia.accept(viajero,true);
        italia.accept(viajero,true);
        brasil.accept(viajero, true);
        argentina.accept(viajero,true);

        bolivia.accept(viajero,false);
        italia.accept(viajero,false);
        brasil.accept(viajero, false);
        argentina.accept(viajero,false);


    }
}
