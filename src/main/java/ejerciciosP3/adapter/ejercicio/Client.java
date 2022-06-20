package ejerciciosP3.adapter.ejercicio;


public class Client {

    public static void main (String [] args){

        ISamsungElectronics celu= new Celular(100,5);
        celu.precio();
        celu.tiempoDeVida();

        ISamsungElectronics tablet= new Tablet(200,9);
        tablet.precio();
        tablet.tiempoDeVida();

        ISamsungElectronics compu= new Computadora(500,10);

        compu.precio();
        compu.tiempoDeVida();

        Refrigerador refri= new Refrigerador(1000,5);
        Televisor tele=new Televisor(1500,8);
        Lavadora lavadora=new Lavadora(20000,10);

        ISamsungElectronics refriA=new RefriAdapter(refri);
        ISamsungElectronics teleA=new TeleAdapter(tele);
        ISamsungElectronics lava=new LavadoraAdapter(lavadora);

        refriA.precio();
        refriA.tiempoDeVida();

        teleA.precio();
        teleA.tiempoDeVida();

        lava.precio();
        lava.tiempoDeVida();




    }

}
