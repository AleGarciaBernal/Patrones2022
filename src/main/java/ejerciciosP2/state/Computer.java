package ejerciciosP2.state;

import java.util.Random;

public class Computer {
    private IStateComputer stateComputer;
    private RAM ram;
    private CPU cpu;

    private String[]programas;

    private int r=new Random().nextInt(20);

    public void llenarProgramas(){
        for(int i = 0;i < r; i++) {
            String concat=i+"";
            programas[i]=concat;
        }
    }

    public Computer() {
        ram= new RAM();
        cpu=new CPU();
        stateComputer = new Apagado();

    }

    public IStateComputer getStateComputer() {
        return stateComputer;
    }

    public void setStateComputer(IStateComputer stateComputer) {
        this.stateComputer = stateComputer;
    }

    public void resourceManager() throws InterruptedException {
        stateComputer.resourceManager(this);
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public String[] getProgramas() {
        return programas;
    }

    public void setProgramas(String[] programas) {
        this.programas = programas;
    }
    public void showProgramas(){
        if(programas.length==0){
            System.out.println("No hay programas funcionando");
        }else {
            for (int i=0;i<programas.length;i++){
                System.out.println("Programa: "+i);
            }
        }
    }
}

