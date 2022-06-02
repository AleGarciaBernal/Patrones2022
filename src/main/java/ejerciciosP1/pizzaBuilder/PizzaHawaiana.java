package ejerciciosP1.pizzaBuilder;

public class PizzaHawaiana extends BuilderPizza {

    @Override
    public void buildIngredientes() {
        this.pizza.setIngredientes("PIZZA HAWAIANA:Piña, Salsa de Tomate, Otro.");
    }

    @Override
    public void buildTipoMasa() {
        this.pizza.setTipoMasa("PIZZA HAWAIANA: Masa Normal");

    }

    @Override
    public void buildTipoQueso() {
        this.pizza.setTipoQueso("PIZZA HAWAIANA: Queso Mozarella, Tipo 2");
    }
}
