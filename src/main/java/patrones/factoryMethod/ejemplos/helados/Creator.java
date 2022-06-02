package patrones.factoryMethod.ejemplos.helados;

abstract class Creator {

    public Creator(){}

    //este es el factoryMethod
    public abstract IHelados createHelado();
}
