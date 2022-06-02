package primerParcialResuelto.interpreter;


public class Client {

    public static void main (String[]args){

        String msg="2 * 7 + 5 + 8";
        Interpreter parser = new Interpreter(msg);
        System.out.println("msg interpretado: "+parser.evaluateMsg());
    }
}
