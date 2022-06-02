package patrones.builder.structure;
//el que se encarga de la creacion d eobjetos concretos
public class Director {
    //Atributo de tipo BUILDER
    private Builder builder;

    //cambiar tipo de retorno del getter
    public Product getProduct() {
        return builder.getProduct();
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    //COnstruccion
    public void buildProduct(){
        builder.createProduct();
        this.builder.buildAt1();
        this.builder.buildAt2();
    }
}
