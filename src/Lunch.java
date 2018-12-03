import java.util.ArrayList;
import java.util.List;

public class Lunch {

    private static Lunch lunch = new Lunch( );


    private Lunch() { }


    public static Lunch getInstance( )
    {
        return lunch;
    }

    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {

        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;

        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {

        for (Item item : items) {
            System.out.print("Item : " + item.name());
            System.out.println(", Price : " + item.price());
        }
    }
}