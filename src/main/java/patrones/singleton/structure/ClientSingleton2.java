package patrones.singleton.structure;

public class ClientSingleton2 {

    public static void main(String args[]){

        Singleton2 s1= Singleton2.getInstance();
        Singleton2 s2= Singleton2.getInstance();
        Singleton2 s3= Singleton2.getInstance();

        System.out.println("Singleton1:"+ s1);
        System.out.println("Singleton2:"+s1);
        System.out.println("Singleton3:"+s1);

        Singleton2.getInstance().time();
        Singleton2.getInstance().time();

    }


}
