package ejerciciosP1.ejercicioInterpreter;

import java.util.ArrayList;
import java.util.List;

public class NonTerminalExpressionParser extends AbstractExpression{
      private List<AbstractExpression> grammar = new ArrayList<>();
      private Context context;

      public NonTerminalExpressionParser(String msgToInterpreter){
                                // asegurando que el msg original no tenga espacios - regla gramatica
          context = new Context(msgToInterpreter.replace(" ",""));
          for ( String charOriginal :  msgToInterpreter.split(" ")) {
              switch (charOriginal){
                  case "1":
                      grammar.add(new TerminalExpressionI());
                      break;
                  case "2":
                      grammar.add(new TerminalExpressionI());
                      break;
                  case "3":
                      grammar.add(new TerminalExpressionI());
                      break;
                  case "4":
                      grammar.add(new TerminalExpressionV());
                      break;
                  case "5":
                      grammar.add(new TerminalExpressionV());
                      break;
                  case "6":
                      grammar.add(new TerminalExpressionV());
                      break;
                  case "7":
                      grammar.add(new TerminalExpressionV());
                      break;
                  case "8":
                      grammar.add(new TerminalExpressionV());
                      break;
                  case "9":
                      grammar.add(new TerminalExpressionX());
                      break;
                  case "10":
                      grammar.add(new TerminalExpressionX());
                      break;
                  default:
                      break;


              }
          }
      }

      public String evaluateMsg(){

          for (AbstractExpression expression:grammar) {
              expression.interpreter(context);
          }

          return context.output;
      }


    @Override
    public void interpreter(Context context) {

    }
}
