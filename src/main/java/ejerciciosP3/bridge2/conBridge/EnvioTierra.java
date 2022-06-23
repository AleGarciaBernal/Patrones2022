package ejerciciosP3.bridge2.conBridge;

public class EnvioTierra implements ITipoEnvio {

    @Override
    public void enviar(Paquete paquete) {
        int porcentaje= (int)(paquete.getPrecio()*(5.0f/100.0f));
        int total=porcentaje+paquete.getPrecio();
        System.out.println("--------Enviando: "+paquete.getNombre()+" por tierra--------");
        System.out.println("El costo del envio es "+total);
    }
}
