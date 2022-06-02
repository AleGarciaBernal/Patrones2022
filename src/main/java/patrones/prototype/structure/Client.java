package patrones.prototype.structure;

public class Client {

    public static void main(String[]args){

        ConcretePrototype1 obj1=new ConcretePrototype1();
        obj1.setAt1("A");
        obj1.setAt2("B");
        obj1.setAt3("C");

        System.out.println(obj1.getAt1());
        System.out.println(obj1.getAt2());
        System.out.println(obj1.getAt3());

        //Ya no usamos new, usamos clone
        //Hay que castear
        ConcretePrototype1 obj2=(ConcretePrototype1) obj1.clone();
        obj2.setAt2("No SOY B");
        System.out.println(obj2.getAt1());
        System.out.println(obj2.getAt2());
        System.out.println(obj2.getAt3());

        System.out.println(obj1.getAt1());
        System.out.println(obj1.getAt2());
        System.out.println(obj1.getAt3());

    }
}
