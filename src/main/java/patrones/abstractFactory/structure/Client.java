package patrones.abstractFactory.structure;

public class Client {

    public static void main (String[]args){

       // miProducto(FacotryProduct.make("product1"));
        FacotryProduct.make("product3").met1();
        //ConcreteProduct1 p1=new ConcreteProduct1();

}
}
