package primerParcialResuelto.prototype;

public class Client {
    public static void main(String args[]){

        Tele template=new Tele();

        template.setSo("Android");
        template.setVersion("11.0");
        template.setSerial(1000000001);
        template.setUsbs(4);
        template.setBluetooth(true);
        template.setControl(true);
        template.setHdmi(true);
        template.setPulgadas(80);
        template.setResolucion(50);

        Tele t1=(Tele) template.clone();
        Tele t2=(Tele) template.clone();
        Tele t3=(Tele) template.clone();
        Tele t4=(Tele) template.clone();
        Tele t5=(Tele) template.clone();

        t2.setSerial(1000000002);
        t3.setSerial(1000000003);
        t4.setSerial(1000000004);
        t5.setSerial(1000000005);

        t1.showInfo();
        t2.showInfo();
        t3.showInfo();
        t4.showInfo();
        t5.showInfo();

    }


}
