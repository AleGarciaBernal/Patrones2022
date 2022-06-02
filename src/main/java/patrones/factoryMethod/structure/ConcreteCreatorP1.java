package patrones.factoryMethod.structure;

public class ConcreteCreatorP1 extends Creator{
//Puede tener mas logica

    //cambiamos el tipo de retorno
    @Override
    public ConcreteProduct1 factoryMethodProduct() {
        //creamos el objeto1
        //llenamos instancias, etc
        //logica de creacion
        ConcreteProduct1 product1=new ConcreteProduct1();
        return null;
    }
}
