package ejerciciosP2.memento;

public class Memento {
    private BaseDeDatos bd;

    public Memento (BaseDeDatos baseDeDatos){
        bd=baseDeDatos;
    }

    public BaseDeDatos getState() {
        return bd;
    }
}
