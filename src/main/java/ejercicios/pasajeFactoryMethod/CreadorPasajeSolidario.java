package ejercicios.pasajeFactoryMethod;

public class CreadorPasajeSolidario extends Creator{

    @Override
    public PasajeSolidario createPasaje() {

        Avion boeing737=new Avion();

        boeing737.setCapaciad(150);
        boeing737.setMarca("Huawei");
        boeing737.setModelo("Boeing 737");
        boeing737.setNroDeAsientos(150);

        Origen bolivia= new Origen();

        bolivia.setAeropuerto("Aeropuerto Biru Biru");
        bolivia.setCiudad("SantaCruz");
        bolivia.setPais("Bolivia");

        Destino usa= new Destino();
        usa.setAeropuerto("Miami International Airport");
        usa.setCiudad("Miami" );
        usa.setPais("U.S.A");

        Pasajero ale= new Pasajero();
        ale.setCi("55521");
        ale.setFechaNacimiento(" ");
        ale.setNombre("Gabriel Montana");

        PasajeSolidario pasajeSolidario = new PasajeSolidario(usa,bolivia,boeing737,ale);

        pasajeSolidario.setNroAsiento(70);
        pasajeSolidario.setNroVuelo(9);
        pasajeSolidario.setPrecio(2500);
        pasajeSolidario.setDescuento(1000);
        pasajeSolidario.setMotivo("Antiguedad");

        return pasajeSolidario;
    }
}
