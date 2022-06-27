package ejerciciosP3.decorator.tarea;
public class Client {
    public static void main(String[] args) {

        IBanco c1=new CuentaBasica("Juan",1000);

        c1=new SeguroCuenta(c1);
        c1=new BancaPorInternet(c1);
        c1=new Promocion(c1);

        c1.showInfo();

    }

}
