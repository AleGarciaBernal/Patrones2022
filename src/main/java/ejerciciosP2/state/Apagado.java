package ejerciciosP2.state;

public class Apagado implements IStateComputer{
    @Override
    public void resourceManager(Computer computer) throws InterruptedException {
        computer.getRam().setCapacidadUsada(0);
        computer.getCpu().setCapacidadUsada(0);
        computer.getCpu().showInfo();
        computer.getRam().showInfo();
        for(int i=0;i<computer.getProgramas().length;i++){
            computer.getProgramas()[i]=null;
        }
        computer.showProgramas();
    }
}
