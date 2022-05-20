package ejercicios.cambioDeMonedas;

public class Client {

    public static void main (String args []){
        Banco banco= new Banco("Obrajes");
        LibreCambistas lc= new LibreCambistas("Juan Perez", 6858585);
        CasaDeCambios cc= new CasaDeCambios("MoneyGram");
        banco.cambiarBsADolares(7);
        lc.cambiarDolaresABs(70);
        cc.cambiarDolaresABs(410);
    }
}
