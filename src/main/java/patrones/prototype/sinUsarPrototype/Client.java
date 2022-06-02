package patrones.prototype.sinUsarPrototype;

public class Client {
    public static void main(String[]args){

        Persona per=new Persona();
        per.setAt1("ah");
        per.setAt2("Daros");
        per.setAt3("jd");
        per.setAt4(55);

        Persona per2=new Persona();
        per=per2;
        per2.setAt3("diferente");

        System.out.println(per.getAt1()+per.getAt2()+per.getAt3()+per.getAt4());
        System.out.println(per2.getAt1()+per2.getAt2()+per2.getAt3()+per2.getAt4());

        //NO FUNCIONA

    }
}
