package ejerciciosP2.state;

public class Prendido implements IStateComputer{


    @Override
    public void resourceManager(Computer computer) throws InterruptedException {
        computer.getProgramas();
        int x=computer.getProgramas().length;
        if (computer.getRam().getCapacidadUsada()<100) {
            x=x*5;
            computer.getRam().setCapacidadUsada(x);
            computer.getCpu().setCapacidadUsada(x);
        }
        computer.getRam().setCapacidadUsada(100);
        computer.getCpu().setCapacidadUsada(100);
        computer.getRam().showInfo();
        computer.getCpu().showInfo();
    }


}
