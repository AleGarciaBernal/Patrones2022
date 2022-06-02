package ejerciciosP1.ejercicioInterpreter;

public class TerminalExpressionX extends AbstractExpression{

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("9")){
            context.output= context.output+" IX ";
            context.input= context.input.substring(1);
        }else if (context.input.startsWith("10")){
            context.output= context.output+" X ";
            context.input= context.input.substring(1);
        }
    }
}
