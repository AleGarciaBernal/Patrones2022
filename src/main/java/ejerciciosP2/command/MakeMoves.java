package ejerciciosP2.command;

import java.util.ArrayList;
import java.util.List;

public class MakeMoves {
    private List <ICommand> commands= new ArrayList<>();

    public MakeMoves(){}

    public void addCommand(ICommand command){
        commands.add(command);
    }

    public void hacerMovimientos(){
        for (ICommand command  : commands  ) {
            command.execute();
        }
        commands.clear();
    }



}
