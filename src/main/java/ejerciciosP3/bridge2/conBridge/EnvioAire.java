package ejerciciosP3.bridge2.conBridge;

public class EnvioAire implements ITipoEnvio {

    @Override
    public void enviar(Paquete paquete) {
        int porcentaje= (int)(paquete.getPrecio()*(10.0f/100.0f));
        int total=porcentaje+paquete.getPrecio();
        System.out.println("--------Enviando: "+paquete.getNombre()+" por aire--------");
        System.out.println("El costo del envio es "+total);
    }
}
