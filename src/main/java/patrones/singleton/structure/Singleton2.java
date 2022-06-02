package patrones.singleton.structure;

import java.util.Date;

public class Singleton2 {

    //atributo del mismo tipo con final
    private static final Singleton2 instance=new Singleton2();
    //no podemos destruir


    //Constructor Privado
    private Singleton2(){
        System.out.println("Creando mi Singleton tipo 2");
    }


    //metodo para acceder(?)
    public static Singleton2 getInstance(){
        return instance;
    }

    //metodos
    public void time(){
        System.out.println("time"+ new Date().toString());
    }

}
