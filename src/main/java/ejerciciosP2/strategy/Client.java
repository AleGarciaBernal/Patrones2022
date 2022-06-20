package ejerciciosP2.strategy;

public class Client {
    public static void main(String []args){

        Tienda tienda=new Tienda("Zara");
        tienda.addRopa(new Ropa("Pantalon", 210));
        tienda.addRopa(new Ropa( "chamarra", 300));
        tienda.addRopa(new Ropa("Camisa", 150));
        tienda.addRopa(new Ropa("Medias", 35));

        tienda.setStrategy(new EstrategiaVerano());
        tienda.execute();
    }
}
