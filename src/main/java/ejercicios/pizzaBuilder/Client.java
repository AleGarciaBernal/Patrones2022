package ejercicios.pizzaBuilder;

public class Client {

    public static void main (String[]args){

        Director luigi=new Director();

        System.out.println("------------------------------------------");
        BuilderPizza pizzaC= new PizzaCarnivora();
        luigi.setPizza(pizzaC);
        luigi.buildPizza();
        Pizza pizza1= luigi.getPizza();
        pizza1.showInfo();

        System.out.println("------------------------------------------");
        BuilderPizza pizzaH= new PizzaHawaiana();
        luigi.setPizza(pizzaH);
        luigi.buildPizza();
        Pizza pizza2= luigi.getPizza();
        pizza2.showInfo();

        System.out.println("------------------------------------------");
        BuilderPizza pizzaCl= new PizzaClasica();
        luigi.setPizza(pizzaCl);
        luigi.buildPizza();
        Pizza pizza3= luigi.getPizza();
        pizza3.showInfo();



    }
}
