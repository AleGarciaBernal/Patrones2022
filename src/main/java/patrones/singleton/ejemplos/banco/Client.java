package patrones.singleton.ejemplos.banco;

public class Client {

    public static void main(String [] args){

        Thread retiro1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Cajero cajero= new Cajero(4);
                cajero.retiriarDineroTargeta(25);

            }
        });

        Thread retiro2 = new Thread(new Runnable() {
            @Override
            public void run() {
                BancaMovil bancaMovil=new BancaMovil(87);
                bancaMovil.retirarDineroMovil(400);

            }
        });

        Thread retiro3 = new Thread(new Runnable() {
            @Override
            public void run() {
                Banco banco=new Banco("Obrjaes");
                banco.retirarDineroBanco(100);

            }
        });

        retiro1.start();
        retiro2.start();
        retiro3.start();
    }


}
