package patrones.singleton.ejemplos.banco;

public class Cuenta {

    private int saldo;

    private static Cuenta instance;

    private Cuenta(){
        saldo=900;
        System.out.println("Saldo Inicial "+saldo);
    }

    public static Cuenta getInstance(){
        if(instance==null){
            multiHiloContol();
        }
        return instance;
    }

    private synchronized static void multiHiloContol(){
        if(instance==null){
            instance=new Cuenta();
        }
    }

    public void retirarDinero(int cantidad){
        if(saldo>=cantidad){
            saldo=saldo-cantidad;
            System.out.println("Nuevo Saldo: "+ saldo);
        }else{
            System.out.println("Saldo Insuficiente");
        }
    }
}
