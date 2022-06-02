package patrones.singleton.structure;

import java.util.Date;

//Los singleton son globales, no hay necesidad de instanciarlo en las demas clases

public class Singleton1 {

    //Atributo del mismo tipo estatico
    private static Singleton1 instance;

    //Constructor Privado
    private Singleton1(){}


    //un metdo estatico para acceder y garantizar que sea solo 1
    public static Singleton1 getInstance(){
        if(instance==null){
            instance=new Singleton1();
        }
        return instance;
    }

    //Otros metodos
    public void time(){
        System.out.println("time: "+new Date());
    }


}
