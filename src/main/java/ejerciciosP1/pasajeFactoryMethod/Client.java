package ejerciciosP1.pasajeFactoryMethod;

public class Client {

    public static void main (String [] args){


        System.out.println("Pasajero 1");
        PasajeStandar p1est=new CreadorPasajeStandar().createPasaje();
        p1est.showInfo();

        System.out.println("Pasajero 2");
        PasajeStandar p2est=new CreadorPasajeStandar().createPasaje();
        p2est.getPasajero().setNombre("Fernando Camacho");
        p2est.getPasajero().setCi("8882063");
        p2est.setNroAsiento(14);

        p2est.showInfo();

        System.out.println("Pasajero 3");
        PasajeSolidario p1s=new CreadorPasajeSolidario().createPasaje();
        p1s.showInfo();

        System.out.println("Pasajero 4");
        PasajeSolidario p2s=new CreadorPasajeSolidario().createPasaje();
        p2s.showInfo();
        p2s.getPasajero().setNombre("Evo Morales");
        p2s.getPasajero().setCi("16166161");
        p2s.setNroAsiento(22);

        System.out.println("Pasajero 5");
        PasajeInfantes p1i=new CreadorPasajeInfante().createPasaje();
        p1est.showInfo();

        System.out.println("Pasajero 6");
        PasajeInfantes p2i=new CreadorPasajeInfante().createPasaje();
        p2i.showInfo();
        p2est.getPasajero().setNombre("Diego Milan");
        p2est.getPasajero().setCi("14141441");
        p2est.setNroAsiento(33);





    }
}
