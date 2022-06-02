package patrones.prototype.structure;

public class ConcretePrototype1 implements IProtoype {
//SI hay objetos, asegurrarse que la instancia exista
    private String at1;
    private String at2;
    private String at3;

    public ConcretePrototype1(){}

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

    public String getAt3() {
        return at3;
    }

    public void setAt3(String at3) {
        this.at3 = at3;
    }

    //Mucho muy importante
    @Override
    public Object clone() {
        ConcretePrototype1 clone=new ConcretePrototype1();
        clone.setAt1(this.getAt1());
        clone.setAt2(this.getAt2());
        clone.setAt3(this.getAt3());
        return clone;
    }
}
