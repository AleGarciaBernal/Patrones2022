package patrones.abstractFactory.example.ides;

public class Factory {

    public static IIDE make(String typeProduct){

        IIDE product;

        switch (typeProduct.toLowerCase()){
            case "product1":
                product=new Intellij();
                break;
            case "product2":
                product=new VisualCode();
                break;
            default:
                product= new Intellij();
                break;
        }
        return product;
    }
}
