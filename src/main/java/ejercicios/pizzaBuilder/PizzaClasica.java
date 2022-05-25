package ejercicios.pizzaBuilder;

public class PizzaClasica extends BuilderPizza {

    @Override
    public void buildIngredientes() {
        this.pizza.setIngredientes("PIZZA CLASICA: Salsa de Tomate, Otro");
    }

    @Override
    public void buildTipoMasa() {
        this.pizza.setTipoMasa("PIZZA CLASICA: Masa Especial");

    }

    @Override
    public void buildTipoQueso() {
        this.pizza.setTipoQueso("PIZZA CLASICA: Doble Queso Mozarella, Tipo 2");
    }
}