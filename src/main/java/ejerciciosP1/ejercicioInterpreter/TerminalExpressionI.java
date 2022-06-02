package ejerciciosP1.ejercicioInterpreter;

public class TerminalExpressionI extends AbstractExpression{

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("1")){
            context.output= context.output+" I ";
            context.input= context.input.substring(1);
        }else if (context.input.startsWith("2")){
            context.output= context.output+" II ";
            context.input= context.input.substring(1);
        }else if (context.input.startsWith("3")){
            context.output= context.output+" III ";
            context.input= context.input.substring(1);
        }
    }
}
