package patrones.singleton.structure;

public class ClientSingleton1 {

    public static void main(String args[]){

        Singleton1 s1= Singleton1.getInstance();
        Singleton1 s2= Singleton1.getInstance();
        Singleton1 s3= Singleton1.getInstance();

        System.out.println("Singleton1:"+ s1);
        System.out.println("Singleton2:"+s1);
        System.out.println("Singleton3:"+s1);



        Singleton1.getInstance().time();
        Singleton1.getInstance().time();



    }


}
