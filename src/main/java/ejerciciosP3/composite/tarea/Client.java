package ejerciciosP3.composite.tarea;

public class Client {

    public static void main(String[]args){

        Computadora c1= new Computadora("Comptadora");
        c1.setDescripcion("Compu nueva");
        c1.setPrecio(100);
        c1.setVendedor("Juan");
        c1.setEspacios("\t\t");

        Computadora c2= new Computadora("Comptadora");
        c2.setDescripcion("Compu nueva!");
        c2.setPrecio(100);
        c2.setVendedor("Juan");
        c2.setEspacios("\t\t");

        Computadora c3= new Computadora("Comptadora");
        c3.setDescripcion("Compu nueva!");
        c3.setPrecio(100);
        c3.setVendedor("Juan");
        c3.setEspacios("\t\t");

        Computadora c4= new Computadora("Comptadora");
        c4.setDescripcion("Compu nueva");
        c4.setPrecio(100);
        c4.setVendedor("Juan");
        c4.setEspacios("\t\t");

        CompositeComputadora l1=new CompositeComputadora("Laboratorio");
        l1.setDescripcion("Laboratorio 1");
        l1.setVendedor("Maria");
        l1.setEspacios("\t");

        l1.add(c1);
        l1.add(c2);
        l1.add(c3);

        CompositeComputadora l2=new CompositeComputadora("Laboratorio");
        l2.setDescripcion("Laboratorio 2");
        l2.setVendedor("Maria");
        l2.setEspacios("\t");

        l2.add(c1);
        l2.add(c2);
        l2.add(c3);
        l2.add(c4);

        CompositeComputadora container1=new CompositeComputadora("Contenedor De Computadoras");
        container1.setDescripcion("container1");
        container1.setVendedor("Jose");
        container1.add(l1);
        container1.add(l2);

        container1.operation();





    }
}
