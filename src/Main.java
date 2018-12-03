import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Pizza pizza1 = new Pizza();

        //Factory

        PizzaType pizzaType1 = pizza1.getPizzaType("Capriciosa");

        System.out.println("The ingredients of the pizza are: ");

        List<String> ingredients1 = pizzaType1.addIngredients();

        for (String element:ingredients1 ) {
            System.out.println( element );
        }

        pizzaType1.showExtras();
        List<String> extras1 = pizzaType1.addExtras("olives","tomatoes","mozzarela");

        System.out.println("You have selected these extra toppings: ");

        for (String element1:extras1 ) {
            System.out.println( element1 );
        }

        Drink drink1 = new Drink();


        // Singleton

        Lunch lunch1 = Lunch.getInstance();

        //Lunch Builder

        lunch1.addItem(pizza1);
        lunch1.addItem(drink1);

        lunch1.showItems();
       System.out.println("Total Cost: " + lunch1.getCost());

       //Strategy

        OrderStrategy order1 = new OrderStrategy(new NormalOrder());
        order1.executeStrategy();

        //Observer

        new Client(order1);
        order1.setState("ready");

        /*new Curier(order1);
        order1.setState("ready");
        */

    }
}