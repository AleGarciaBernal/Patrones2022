package ejerciciosP3.bridge2.nobridge;

public class EmpresaSRL implements IEmpresa{

    @Override
    public void envioAire(Paquete paquete) {
        System.out.println("--------Enviando Paquete Por Aire"+paquete.getNombre()+"--------");
    }

    @Override
    public void envioTierra(Paquete paquete) {
        System.out.println("--------Enviando Paquete Por Tierra"+paquete.getNombre()+"--------");
    }

    @Override
    public void envioMar(Paquete paquete) {
        System.out.println("--------Enviando Paquete Por Tierra"+paquete.getNombre()+"--------");
    }
}
