package ejerciciosP2.state;

public class Client {

    public static void main (String[]args) throws InterruptedException {
        Computer computer = new Computer();
        computer.setStateComputer(new Prendido());
        computer.resourceManager();

    }

}
