package ejerciciosP1.ejercicioInterpreter2;

public class Client {

    public static void main (String[]args){

        String msg="10";
        NonTerminalExpressionParser parser = new NonTerminalExpressionParser(msg);
        System.out.println("msg interpretado: "+parser.evaluateMsg());
    }
}
