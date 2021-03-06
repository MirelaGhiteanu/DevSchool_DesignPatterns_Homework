import java.util.ArrayList;
import java.util.List;

public class QuatroStagioni implements PizzaType {

    public ArrayList<String> extras = new ArrayList<>();
    public ArrayList<String>ingredients = new ArrayList<>();

    @Override
    public List<String> addIngredients() {
        ingredients.add("pepperoni");
        ingredients.add("mushrooms");
        ingredients.add("pepper");
        ingredients.add("olives");

        return ingredients;
    }

    @Override
    public List<String> addExtras(String extra1, String extra2, String extra3) {


        extras.add(extra1);
        extras.add(extra2);
        extras.add(extra3);
        return extras;
    }


    @Override
    public void showExtras() {
        System.out.println("Extras available for QuatroStagioni are: ");
        System.out.println("1. tomatoes");
        System.out.println("2. carrots");
        System.out.println("3. mozzarela");
        System.out.println("4. zuchini");
        System.out.println("You can select just 3!");

    }



}

