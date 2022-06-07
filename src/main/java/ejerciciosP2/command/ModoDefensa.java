package ejerciciosP2.command;

public class ModoDefensa implements ICommand{

    private Juego juego;

    public ModoDefensa(Juego juego){
        this.juego=juego;
    }

    @Override
    public void execute() {
        System.out.println("Ejecutando el comando Modo Defensa");
        juego.modoDefensa();
    }
}
