package patrones.builder.structure;

public class Product {

//Builder para objetos pre definidos

    private String at1;
    private String at2;

    public Product(){}

    public String getAt1() {
        return at1;
    }

    public void setAt1(String at1) {
        this.at1 = at1;
    }

    public String getAt2() {
        return at2;
    }

    public void setAt2(String at2) {
        this.at2 = at2;
    }

    public void showInfo(){
        System.out.println(at1);
        System.out.println(at2);

    }
}
