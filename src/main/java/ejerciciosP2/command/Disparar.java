package ejerciciosP2.command;

public class Disparar implements ICommand{

    private Juego juego;

    public Disparar(Juego juego){
        this.juego=juego;
    }

    @Override
    public void execute() {
        System.out.println("Ejecutando el comando disparar");
        juego.disparar();
    }
}
