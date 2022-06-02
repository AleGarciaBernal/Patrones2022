package ejerciciosP1.pasajeFactoryMethod;

public class CreadorPasajeInfante extends Creator{

    @Override
    public PasajeInfantes createPasaje() {

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
        ale.setFechaNacimiento("25/05/2018");
        ale.setNombre("Marcelo Luna");

        PasajeInfantes pasajeInfantes = new PasajeInfantes(usa,bolivia,boeing737,ale);

        pasajeInfantes.setNroAsiento(68);
        pasajeInfantes.setNroVuelo(7);
        pasajeInfantes.setPrecioEspacial(1500);

        return pasajeInfantes;
    }
}
