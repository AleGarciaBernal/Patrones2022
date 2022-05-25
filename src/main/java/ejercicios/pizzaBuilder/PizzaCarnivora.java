package ejercicios.pizzaBuilder;

public class PizzaCarnivora extends BuilderPizza {

    @Override
    public void buildIngredientes() {
        this.pizza.setIngredientes("PIZZA CARNIVORA:Carne, Salsa de Tomate, Otro.");
    }

    @Override
    public void buildTipoMasa() {
        this.pizza.setTipoMasa("PIZZA CARNIVORA: Masa Especial");

    }

    @Override
    public void buildTipoQueso() {
        this.pizza.setTipoQueso("PIZZA CARNIVORA: Queso Mozarella");
    }
}
