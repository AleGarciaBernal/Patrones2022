package primerParcialResuelto.abstractFactory;

public class Client {
    public static void main(String []args){

        Electronicos ele= FactoryElectronicos.make("radio");

        ele.showInfo();
        encenderse(ele);
        apagarse(ele);
        mostrarInterfaz(ele);
    }

    private static void encenderse(Electronicos electronicos) {
    }
    private static void apagarse(Electronicos electronicos) {
    }
    private static void mostrarInterfaz(Electronicos electronicos) {
    }
}
