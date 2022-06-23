package ejerciciosP3.bridgeClases.conBridge;

public class Windows implements ISO {

    IArquitectura arquitectura;

    public Windows(IArquitectura arquitectura) {
        this.arquitectura = arquitectura;
    }

    @Override
    public void arquitectura() {
        System.out.println("Arquitectura es:");
        arquitectura.arquitectura();


    }
}
