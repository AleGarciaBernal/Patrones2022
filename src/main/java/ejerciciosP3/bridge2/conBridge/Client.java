package ejerciciosP3.bridge2.conBridge;

public class Client {

    public static void main (String[]args){

        Paquete p1 =new Paquete("Ropa",100);
        Paquete p2=new Paquete("Electrodomesticos",200);
        Paquete p3=new Paquete("Vajillas",300);


        ITipoEnvio envioAire=new EnvioAire();
        ITipoEnvio envioTierra=new EnvioTierra();
        ITipoEnvio envioMar=new EnvioMar();

        EmpresaSA empresaSA=new EmpresaSA(envioMar);
        EmpresaSRL empresaSRL = new EmpresaSRL(envioAire);
        System.out.println("*************************Envios SA********************");
        empresaSA.enviar(p1);
        empresaSA.setTipoEnvio(envioMar);
        empresaSA.enviar(p3);

        System.out.println("*************************Envios SRL********************");
        empresaSRL.enviar(p1);
        empresaSRL.setTipoEnvio(envioTierra);
        empresaSRL.enviar(p1);


        empresaSA.showPaquetesEnviados();
        empresaSRL.showPaquetesEnviados();



    }
}
