package ejercicios.pasajeFactoryMethod;

public class PasajeInfantes implements IPasaje{

    private int nroVuelo;
    private Destino destino;
    private Origen origen;
    private Avion avion;
    private Pasajero pasajero;
    private int nroAsiento;
    private int precioEspacial;


    @Override
    public void showInfo() {
        System.out.println("PASAJE INFANTE");
        System.out.println("Vuelo: " + nroVuelo);

        System.out.println("Destino ciudad: "+destino.getCiudad());
        System.out.println("Destino pais: "+destino.getPais());
        System.out.println("Destino Aeropuerto: "+destino.getAeropuerto());

        System.out.println("Origen Ciudad: "+origen.getCiudad());
        System.out.println("Origen Pais: "+origen.getPais());
        System.out.println("Origen Aeropuerto: "+origen.getAeropuerto());

        System.out.println("Marca del Avion: " +avion.getMarca());
        System.out.println("Modelo del Avion: " +avion.getModelo());
        System.out.println("Capacidad del Avion: " +avion.getCapaciad());
        System.out.println("Cantidad de asientos en el Avion" +avion.getNroDeAsientos());

        System.out.println("Nombre Del Pasajero: "+pasajero.getNombre());
        System.out.println("CI del pasajero "+pasajero.getCi());

        System.out.println("Asiento: "+nroAsiento);
        System.out.println("Precio Especial: " +precioEspacial);

    }

    public PasajeInfantes(Destino destino, Origen origen,Avion avion, Pasajero pasajero){
        this.avion=avion;
        this.pasajero=pasajero;
        this.origen=origen;
        this.destino=destino;
    }

    public int getNroVuelo() {
        return nroVuelo;
    }

    public void setNroVuelo(int nroVuelo) {
        this.nroVuelo = nroVuelo;
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    public Origen getOrigen() {
        return origen;
    }

    public void setOrigen(Origen origen) {
        this.origen = origen;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public int getNroAsiento() {
        return nroAsiento;
    }

    public void setNroAsiento(int nroAsiento) {
        this.nroAsiento = nroAsiento;
    }

    public int getPrecioEspacial() {
        return precioEspacial;
    }

    public void setPrecioEspacial(int precioEspacial) {
        this.precioEspacial = precioEspacial;
    }
}
