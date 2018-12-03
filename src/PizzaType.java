import java.util.List;

interface PizzaType{


    List<String> addIngredients();
    List<String> addExtras(String extra1, String extra2, String extra3);
    void showExtras();

}
