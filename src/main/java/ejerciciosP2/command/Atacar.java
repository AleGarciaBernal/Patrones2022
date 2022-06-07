package ejerciciosP2.command;

public class Atacar implements ICommand{

    private Juego juego;

    public Atacar(Juego juego){
        this.juego=juego;
    }

    @Override
    public void execute() {
        System.out.println("Ejecutando el comando Atacar");
        juego.atacar();
    }
}
