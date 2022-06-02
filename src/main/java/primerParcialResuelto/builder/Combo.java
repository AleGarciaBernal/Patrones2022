package primerParcialResuelto.builder;

public class Combo {

    private String pipocas;
    private int cantidadDeVasos;
    private String tipoDeVasos;
    private boolean recargaIlimitadas;
    private int nroChocolates;

    public String getPipocas() {
        return pipocas;
    }

    public Combo setPipocas(String pipocas) {
        this.pipocas = pipocas;
        return this;
    }

    public int getCantidadDeVasos() {
        return cantidadDeVasos;
    }

    public Combo setCantidadDeVasos(int cantidadDeVasos) {
        this.cantidadDeVasos = cantidadDeVasos;
        return this;
    }

    public String getTipoDeVasos() {
        return tipoDeVasos;
    }

    public Combo setTipoDeVasos(String tipoDeVasos) {
        this.tipoDeVasos = tipoDeVasos;
        return this;
    }

    public boolean isRecargaIlimitadas() {
        return recargaIlimitadas;
    }

    public Combo setRecargaIlimitadas(boolean recargaIlimitadas) {
        this.recargaIlimitadas = recargaIlimitadas;
        return this;
    }

    public int getNroChocolates() {
        return nroChocolates;
    }

    public Combo setNroChocolates(int nroChocolates) {
        this.nroChocolates = nroChocolates;
        return this;
    }

    public void showInfo(){
        System.out.println("------------------------------------------");
        System.out.println("Tamaño de Pipocas: "+ pipocas);
        System.out.println("Cantidad de vasos: "+cantidadDeVasos);
        System.out.println("Tamaño de los vasos: "+tipoDeVasos);
        System.out.println("Recargas ilimitadas: "+recargaIlimitadas);
        System.out.println("Cantidad de chocolotas: "+nroChocolates);

    }
}
