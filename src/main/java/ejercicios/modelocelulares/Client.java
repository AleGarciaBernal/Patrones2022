package ejercicios.modelocelulares;

public class Client {

    public static void main (String []args){

        ConcreteSamsungR10 celular1 = new ConcreteSamsungR10();

        celular1.setTamanioCM(20);
        celular1.setCpu("OctaDragon, 4 nucleos");
        celular1.setMemoryGB("128 gigas");
        celular1.setSim("Viva, 77893651");
        celular1.setVersionAndroid(12);
        celular1.setCamaraPixeles("128 pixeles");
        celular1.setBluetooth(true);
        celular1.setCantidadMemoria(2);
        celular1.setTipoBateria("Baterías de Niquel-Cadmio");
        celular1.setAccesorios("Audifonos, Cargador y Lapiz");


        System.out.println("celular 1 : "+celular1.getTamanioCM());
        System.out.println("celular 1 : "+celular1.getCpu());
        System.out.println("celular 1 : "+celular1.getMemoryGB());
        System.out.println("celular 1 : "+celular1.getSim());
        System.out.println("celular 1 : "+celular1.getCamaraPixeles());
        System.out.println("celular 1 : "+celular1.isBluetooth());
        System.out.println("celular 1 : "+celular1.getVersionAndroid());
        System.out.println("celular 1 : "+celular1.getCantidadMemoria());
        System.out.println("celular 1 : "+celular1.getTipoBateria());
        System.out.println("celular 1 : "+celular1.getAccesorios());

        ConcreteSamsungR10 celular2 = (ConcreteSamsungR10) celular1.clone();

        celular2.setSim("Tigo, 6983626");

        System.out.println("celular 2 : "+celular2.getTamanioCM());
        System.out.println("celular 2 : "+celular2.getCpu());
        System.out.println("celular 2 : "+celular2.getMemoryGB());
        System.out.println("celular 2 : "+celular2.getSim());
        System.out.println("celular 2 : "+celular2.getCamaraPixeles());
        System.out.println("celular 2 : "+celular2.isBluetooth());
        System.out.println("celular 2 : "+celular2.getVersionAndroid());
        System.out.println("celular 2 : "+celular2.getCantidadMemoria());
        System.out.println("celular 2 : "+celular2.getTipoBateria());
        System.out.println("celular 2 : "+celular2.getAccesorios());

        ConcreteSamsungR10 celular3 = (ConcreteSamsungR10) celular1.clone();

        celular2.setSim("Entel, 772819932");

        System.out.println("celular 3 : "+celular3.getTamanioCM());
        System.out.println("celular 3: "+celular3.getCpu());
        System.out.println("celular 3 : "+celular3.getMemoryGB());
        System.out.println("celular 3 : "+celular3.getSim());
        System.out.println("celular 3 : "+celular3.getCamaraPixeles());
        System.out.println("celular 3 : "+celular3.isBluetooth());
        System.out.println("celular 3 : "+celular3.getVersionAndroid());
        System.out.println("celular 3 : "+celular3.getCantidadMemoria());
        System.out.println("celular 3 : "+celular3.getTipoBateria());
        System.out.println("celular 3 : "+celular3.getAccesorios());


    }


}
