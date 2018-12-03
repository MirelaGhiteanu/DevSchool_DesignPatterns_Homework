import java.util.List;

public class Pizza implements Item{

    public String name(){

        return "Pizza";
    }

    public float price()
    {
        return 5.5f;
    }

    public List<String> ingredients;
    public List<String> extras;



    public PizzaType getPizzaType(String PizzaType){
        if(PizzaType == null){
            return null;
        }

        if(PizzaType.equals("Capriciosa")){
            return new Capriciosa();

        }

        if(PizzaType.equals("Capricio")){
            return new Capricio();

        }

        if(PizzaType.equals("QuatroStagioni")){
            return new QuatroStagioni();

        }

        if(PizzaType.equals("Pollo")){
            return new Pollo();

        }

        if(PizzaType.equals("Margherita")){
            return new Margherita();

        }

        return null;
    }


}
