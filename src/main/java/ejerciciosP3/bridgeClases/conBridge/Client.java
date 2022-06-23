package ejerciciosP3.bridgeClases.conBridge;

public class Client {

    public static void main (String[]args){
        IArquitectura soy64= new x64();
        IArquitectura soy86= new x86();

        Windows windows = new Windows(soy64);
        windows.arquitectura();

        Linux linux = new Linux(soy86);
        linux.arquitectura();



    }
}
