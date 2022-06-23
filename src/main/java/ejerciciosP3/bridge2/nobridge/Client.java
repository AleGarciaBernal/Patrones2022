package ejerciciosP3.bridge2.nobridge;


public class Client {

    public static void main(String[]args){

        Paquete ropa=new Paquete("Ropa",100);
        Paquete electros=new Paquete("Electros",100);



        EmpresaSA empresaSA= new EmpresaSA();
        EmpresaSRL empresaSRL=new EmpresaSRL();

        empresaSA.envioAire(ropa);
        empresaSA.envioMar(electros);
        empresaSRL.envioMar(electros);




    }
}
