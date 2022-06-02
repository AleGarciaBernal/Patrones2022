package patrones.builder.structure;

public abstract class Builder {
    //Usar protected(?)
    //atributo del producto concreto
    protected Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void createProduct(){
        this.product=new Product();
    }

    //build de los atributos
    public abstract void buildAt1();
    public abstract void buildAt2();

 }
