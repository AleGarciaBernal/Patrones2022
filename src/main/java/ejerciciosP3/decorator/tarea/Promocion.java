package ejerciciosP3.decorator.tarea;

import java.util.Random;

public class Promocion extends Beneficios {

    Random random = new Random();
    // generate random number from 0 to 3
    int number = random.nextInt(1500);


    public Promocion(IBanco banco) {
        super(banco);
    }

    @Override
    public void showInfo(){
        super.showInfo();
        addBehavior();
    }

    @Override
    public int getMonto() {
        return 0;
    }

    @Override
    public void setMonto(int monto) {

    }

    private void addBehavior() {
        if(number%2==0){
            int x=super.getMonto()*2;
            super.setMonto(x);
            System.out.println("GANASTEE!");
        }
        else {
            System.out.println("PERDISTE!");

        }

    }
}
