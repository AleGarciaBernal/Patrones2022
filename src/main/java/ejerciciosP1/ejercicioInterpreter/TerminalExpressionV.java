package ejerciciosP1.ejercicioInterpreter;

public class TerminalExpressionV extends AbstractExpression{

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("4")){
            context.output= context.output+" IV ";
            context.input= context.input.substring(1);
        }else if (context.input.startsWith("5")){
            context.output= context.output+" V ";
            context.input= context.input.substring(1);
        }else if (context.input.startsWith("6")){
            context.output= context.output+" VI ";
            context.input= context.input.substring(1);
        }else if (context.input.startsWith("7")){
            context.output= context.output+" VII ";
            context.input= context.input.substring(1);
        }else if (context.input.startsWith("8")){
            context.output= context.output+" VIII ";
            context.input= context.input.substring(1);
        }
    }
}
