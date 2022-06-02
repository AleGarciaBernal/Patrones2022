package primerParcialResuelto.singleton;

import java.util.ArrayList;
import java.util.List;

public class Cabina {

    private static Cabina instance;

    private int dinero;
    private int contador;
    //String[] cars;
    List<String> listaDeAutos = new ArrayList<String>();

    private Cabina(){
        System.out.println("Creando Cabina");
        dinero=0;
        System.out.println("Recaudacion inidical: " +dinero);
    }

    public static Cabina getInstance(){
        if(instance==null){
            instance=new Cabina();
        }
        return instance;
    }

    public void mostrar(){
        if(contador==6){
            System.out.println("Se racaudo: "+ dinero);
            for (int x = 0; x < listaDeAutos.size(); x++){
                String auto=listaDeAutos.get(x);
                System.out.println(auto);
            }
        }
    }

    public void pagar(String modelo){
        switch (modelo){
            case "Pequeño":
                System.out.println("Es un auto pequeño, paga 1 Bs.");
                dinero=dinero+1;
                contador++;
                break;
            case "Mediano":
                System.out.println("Es un auto mediano, paga 3 Bs.");
                dinero=dinero+3;
                contador++;
                break;
            case "Grande":
                System.out.println("Es un auto grande, paga 5 Bs.");
                dinero=dinero+5;
                contador++;
                break;
            default:
                break;
        }
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
}
