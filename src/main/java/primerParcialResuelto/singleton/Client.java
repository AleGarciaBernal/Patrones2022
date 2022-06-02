package primerParcialResuelto.singleton;

public class Client {

    public static void main(String args[]){


        Auto a1=new Auto("Grande", 111, "Rojo");
        Auto a2=new Auto("Mediano", 222, "Negro");
        Auto a3=new Auto("Pequeño", 333, "Azul");
        Auto a4=new Auto("Pequeño", 444, "Rojo");
        Auto a5=new Auto("Grande", 555, "Amarillo");
        Auto a6=new Auto("Mediano", 666, "Negro");
        Auto a7=new Auto("Grande", 777, "Blanco");

        a1.pagar(a1.getModelo());
        a2.pagar(a2.getModelo());
        a3.pagar(a3.getModelo());
        a4.pagar(a4.getModelo());
        a5.pagar(a5.getModelo());
        a6.pagar(a6.getModelo());
        a7.pagar(a7.getModelo());


    }
}
