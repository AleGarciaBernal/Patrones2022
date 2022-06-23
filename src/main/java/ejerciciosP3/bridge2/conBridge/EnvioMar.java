package ejerciciosP3.bridge2.conBridge;

public class EnvioMar implements ITipoEnvio {

    @Override
    public void enviar(Paquete paquete) {
        int porcentaje= paquete.getPrecio()/2;
        int total=porcentaje+paquete.getPrecio();
        System.out.println("--------Enviando: "+paquete.getNombre()+" por mar--------");
        System.out.println("El costo del envio es "+total);
    }
}
