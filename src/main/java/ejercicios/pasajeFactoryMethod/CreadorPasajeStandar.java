package ejercicios.pasajeFactoryMethod;

public class CreadorPasajeStandar extends Creator{

    @Override
    public PasajeStandar createPasaje() {

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
        ale.setCi("6859321");
        ale.setFechaNacimiento(" ");
        ale.setNombre("Alejandra Garcia");

        PasajeStandar pasajeStandar=new PasajeStandar(usa,bolivia,boeing737,ale);

        pasajeStandar.setNroAsiento(68);
        pasajeStandar.setNroVuelo(7);
        pasajeStandar.setPrecio(2500);

        return pasajeStandar;
    }
}
