package patrones.abstractFactory.example.ides;

public class Client {

    public static void main(String[]args){

        IIDE iide=Factory.make("product1");
        iide.showName();
        Factory.make("product2").showName();
    }

}
