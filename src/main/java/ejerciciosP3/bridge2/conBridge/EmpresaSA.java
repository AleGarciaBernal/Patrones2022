package ejerciciosP3.bridge2.conBridge;

import java.util.ArrayList;
import java.util.List;

public class EmpresaSA implements IEmpresa{

    private List<Paquete> paquetesEnviados=new ArrayList<>();
    private ITipoEnvio tipoEnvio;

    public EmpresaSA(ITipoEnvio tipoEnvio) {
        this.tipoEnvio = tipoEnvio;
    }

    @Override
    public void enviar(Paquete paquete) {
        tipoEnvio.enviar(paquete);
        paquetesEnviados.add(paquete);
    }

    @Override
    public void showPaquetesEnviados() {
        System.out.println("---------Lista de paquetes enviados por SA---------");
        for (Paquete p:paquetesEnviados) {
            System.out.println(p.getNombre());

        }
    }

    public List<Paquete> getPaquetesEnviados() {
        return paquetesEnviados;
    }

    public void setPaquetesEnviados(List<Paquete> paquetesEnviados) {
        this.paquetesEnviados = paquetesEnviados;
    }

    public ITipoEnvio getTipoEnvio() {
        return tipoEnvio;
    }

    public void setTipoEnvio(ITipoEnvio tipoEnvio) {
        this.tipoEnvio = tipoEnvio;
    }
}
