package patrones.builder.structure;

public class ConcreteBuilder1 extends Builder {


    @Override
    public void buildAt1() {
        product.setAt1("Soy objeto concreto 1");

    }

    @Override
    public void buildAt2() {
        product.setAt2("Soy objeto concreto 1xxx");
    }
}
