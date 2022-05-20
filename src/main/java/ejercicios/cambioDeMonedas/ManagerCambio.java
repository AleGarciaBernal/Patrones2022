package ejercicios.cambioDeMonedas;

public class ManagerCambio {
    private static ManagerCambio managerCambio;

    private int valorBsADolar = 7;
    private int valorBsAEuro = 9;
    private int valorDolarABs = 1/7;
    private int valorEuABs = 1/9;


    private ManagerCambio(){}

    public static ManagerCambio getInstance(){
        if(managerCambio==null)
            managerCambio=new ManagerCambio();
            return managerCambio;
        }
   public void bsADolares(int cantidad){
        if(cantidad>=valorBsADolar){
            System.out.println("Cambio Exitoso");
        }else {
            System.out.println("No se concreto el cambio");
        }
   }
    public void bsAEuros(int cantidad){
        if(cantidad>=valorBsAEuro){
            System.out.println("Cambio Exitoso");
        }else {
            System.out.println("No se concreto el cambio");
        }
    }
    public void dolarABs(int cantidad){
        if(cantidad>=valorDolarABs){
            System.out.println("Cambio Exitoso");
        }else {
            System.out.println("No se concreto el cambio");
        }
    }

    public void euroABs(int cantidad){
        if(cantidad>=valorEuABs){
            System.out.println("Cambio Exitoso");
        }else {
            System.out.println("No se concreto el cambio");
        }
    }

}

