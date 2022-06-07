package ejerciciosP2.command;

public class Client {
    public static void main(String [] args){

           Juego juego = new Juego();

           Disparar cmd1= new Disparar(juego);
           ModoDefensa cmd2= new ModoDefensa(juego);
           Atacar cmd3= new Atacar(juego);

           MakeMoves mm = new MakeMoves();

           mm.addCommand(cmd1);
           mm.addCommand(cmd3);
           mm.addCommand(cmd2);
           mm.addCommand(cmd1);

           mm.hacerMovimientos();
    }

}
