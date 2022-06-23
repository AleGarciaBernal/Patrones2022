package ejerciciosP3.bridgeClases.noBridge;


public class Client {

    public static void main(String[]args){
        Linux linux= new Linux();
        linux.arquitectura64();
        linux.arquitectura86();

        Windows windows=new Windows();
        windows.arquitectura64();
        windows.arquitectura86();

        Mac mac=new Mac();
        mac.arquitectura64();
        mac.arquitectura86();


    }
}
