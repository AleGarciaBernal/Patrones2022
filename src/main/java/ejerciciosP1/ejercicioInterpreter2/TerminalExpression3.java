package ejerciciosP1.ejercicioInterpreter2;

public class TerminalExpression3 extends AbstractExpression{

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("3")){
            context.output= context.output+" III";
            context.input= context.input.substring(1);
        }
    }
}
