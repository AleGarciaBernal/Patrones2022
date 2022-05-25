package ejercicios.pizzaBuilder;

public class Director {

    private BuilderPizza builderPizza;

    public Pizza getPizza(){
        return builderPizza.getPizza();
    }

    public void setPizza(BuilderPizza builderPizza){
        this.builderPizza=builderPizza;
    }

    public void buildPizza(){
        this.builderPizza.createPizza();
        this.builderPizza.buildIngredientes();
        this.builderPizza.buildTipoQueso();
        this.builderPizza.buildTipoMasa();
    }

}
