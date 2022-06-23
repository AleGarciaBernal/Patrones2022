package ejerciciosP3.bridgeClases.conBridge;

public class Linux implements ISO {

    IArquitectura arquitectura;

    public Linux(IArquitectura arquitectura) {
        this.arquitectura = arquitectura;
    }

    @Override
    public void arquitectura() {
        System.out.println("Arquitectura es:");
        arquitectura.arquitectura();


    }
}
