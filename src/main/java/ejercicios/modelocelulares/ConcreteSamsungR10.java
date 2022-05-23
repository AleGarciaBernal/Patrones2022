package ejercicios.modelocelulares;

public class ConcreteSamsungR10 {

    private int tamanioCM;
    private String cpu;
    private String memoryGB;
    private String sim;
    private int versionAndroid;
    private String camaraPixeles;
    private boolean bluetooth;
    private int cantidadMemoria;
    private String tipoBateria;
    private String accesorios;

    public ConcreteSamsungR10() {
    }

    public int getTamanioCM() {
        return tamanioCM;
    }

    public void setTamanioCM(int tamanioCM) {
        this.tamanioCM = tamanioCM;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMemoryGB() {
        return memoryGB;
    }

    public void setMemoryGB(String memoryGB) {
        this.memoryGB = memoryGB;
    }

    public String getSim() {
        return sim;
    }

    public void setSim(String sim) {
        this.sim = sim;
    }

    public int getVersionAndroid() {
        return versionAndroid;
    }

    public void setVersionAndroid(int versionAndroid) {
        this.versionAndroid = versionAndroid;
    }

    public String getCamaraPixeles() {
        return camaraPixeles;
    }

    public void setCamaraPixeles(String camaraPixeles) {
        this.camaraPixeles = camaraPixeles;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public int getCantidadMemoria() {
        return cantidadMemoria;
    }

    public void setCantidadMemoria(int cantidadMemoria) {
        this.cantidadMemoria = cantidadMemoria;
    }

    public String getTipoBateria() {
        return tipoBateria;
    }

    public void setTipoBateria(String tipoBateria) {
        this.tipoBateria = tipoBateria;
    }

    public String getAccesorios() {
        return accesorios;
    }

    public void setAccesorios(String accesorios) {
        this.accesorios = accesorios;
    }

    @Override
    public Object clone() {
        ConcreteSamsungR10 clone= new ConcreteSamsungR10();
        clone.setTamanioCM(this.getTamanioCM());
        clone.setMemoryGB(this.getMemoryGB());
        clone.setCpu(this.getCpu());
        clone.setSim(this.getSim());
        clone.setVersionAndroid(this.getVersionAndroid());
        clone.setCamaraPixeles(this.getCamaraPixeles());
        clone.setBluetooth(this.isBluetooth());
        clone.setCantidadMemoria(this.getCantidadMemoria());
        clone.setTipoBateria(this.getTipoBateria());
        clone.setAccesorios(this.getAccesorios());
        return clone;
    }
}
