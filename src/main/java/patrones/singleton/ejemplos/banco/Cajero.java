package patrones.singleton.ejemplos.banco;

import patrones.singleton.ejemplos.banco.Cuenta;

public class Cajero {
    private int numeroCajero;
    //private Person person;

    public Cajero(int numeroCajero){
        //this.person=person;
        this.numeroCajero=numeroCajero;
    }

    public void retiriarDineroTargeta(int cantidad){
        Cuenta.getInstance().retirarDinero(cantidad);
    }
}
