package ejerciciosP3.decorator.tarea;

public class CuentaBasica implements IBanco{

    private String nombrePropietario;
    private int monto;

    public CuentaBasica(String nombrePropietario, int monto) {
        this.nombrePropietario = nombrePropietario;
        this.monto = monto;
    }

    @Override
    public void showInfo() {
        System.out.println("Propietario: "+nombrePropietario);
        System.out.println("Monto: "+monto);
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    @Override
    public int getMonto() {
        return monto;
    }

    @Override
    public void setMonto(int monto) {
        this.monto = monto;
    }
}
