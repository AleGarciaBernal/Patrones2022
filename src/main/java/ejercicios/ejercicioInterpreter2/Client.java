package ejercicios.ejercicioInterpreter2;

public class Client {

    public static void main (String[]args){

        String msg="1 2 3 4 5 6 7 8 9 10";
        NonTerminalExpressionParser parser = new NonTerminalExpressionParser(msg);
        System.out.println("msg interpretado: "+parser.evaluateMsg());
    }
}
