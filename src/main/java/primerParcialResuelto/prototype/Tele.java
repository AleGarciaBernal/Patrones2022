package primerParcialResuelto.prototype;

public class Tele implements ITele{

    private String so;
    private String version;
    private int pulgadas;
    private int resolucion;
    private boolean hdmi;
    private int usbs;
    private boolean control;
    private boolean bluetooth;
    private int serial;

    public Tele(){}

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isHdmi() {
        return hdmi;
    }

    public void setHdmi(boolean hdmi) {
        this.hdmi = hdmi;
    }

    public int getUsbs() {
        return usbs;
    }

    public void setUsbs(int usbs) {
        this.usbs = usbs;
    }

    public boolean isControl() {
        return control;
    }

    public void setControl(boolean control) {
        this.control = control;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }



    @Override
    public Object clone() {
        Tele clone = new Tele();

        clone.setBluetooth(this.isBluetooth());
        clone.setControl(this.isControl());
        clone.setHdmi(this.isHdmi());
        clone.setPulgadas(this.getPulgadas());
        clone.setResolucion(this.getResolucion());
        clone.setUsbs(this.getUsbs());
        clone.setVersion(this.getVersion());
        clone.setSerial(this.getSerial());
        clone.setSo(this.getSo());

        return clone;

    }

    public void showInfo(){
        System.out.println("---------------TELE INFO----------------");

        System.out.println("Blutooth: "+ bluetooth);
        System.out.println("Control: "+ control);
        System.out.println("HDMI: "+hdmi);
        System.out.println("Pulgadas: "+ pulgadas);
        System.out.println("Resolucion: "+ resolucion);
        System.out.println("USB'S: "+ usbs);
        System.out.println("Version: "+ version);
        System.out.println("Serial: "+ serial);
        System.out.println("Sistema Operativo: "+ so);

    }

}
