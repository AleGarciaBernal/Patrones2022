package patrones.builder.structure;

public class ConcreteBuilder2 extends Builder {


    @Override
    public void buildAt1() {
        product.setAt1("Soy objeto concreto 2");

    }

    @Override
    public void buildAt2() {
        product.setAt2("Soy objeto concreto 2xxx");
    }
}
