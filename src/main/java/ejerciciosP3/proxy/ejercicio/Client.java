package ejerciciosP3.proxy.ejercicio;


public class Client {

    public static void main(String[] args) {

        Persona juan=new Persona("Juan",12314);
        Cuenta cuentita=new Cuenta(juan,400);
        ICuenta tarjetita=new TarjetaProxy(cuentita);

        Producto secadora=new Producto("Secadora",30,"dolares");
        Producto empanada=new Producto("Empanada",10,"");
        Producto raqueta=new Producto("Raqueta",100,"euros");

        cuentita.showInfo();
        System.out.println("---------------------------");
        tarjetita.comprar(secadora);
        tarjetita.comprar(empanada);
        tarjetita.comprar(raqueta);
        System.out.println("---------------------------");
        cuentita.showInfo();
        cuentita.showProductos();

    }
}
