package patrones.singleton.structure;

import java.util.Date;

public class Singleton3 {

    //atributo de la misma clase estatico (instance)
    private static Singleton3 instance;

    //tiene que tener constructor privado
    private Singleton3(){
        System.out.println("Creando mi Singleton");
    }

    //metodo global para el acceso a la clase----Aqui controlamos que haya solo una instancia
    public static Singleton3 getInstance(){
        if(instance==null){
            multiHiloContol();
        }
        return instance;
    }

    private synchronized static void multiHiloContol(){
        if(instance==null){
            instance=new Singleton3();
        }
    }

// Cualquier otro metodo
    public void time(){
        System.out.println("time"+ new Date().toString());
    }

}
