import java.util.ArrayList;
import java.util.List;

//Strategy

public class OrderStrategy {

    private Strategy strategy;

    public OrderStrategy(Strategy strategy)
    {
        this.strategy = strategy;
    }

    public void executeStrategy(){

        strategy.Order();
    }

//Observer

    private List<Observer> observers = new ArrayList<Observer>();
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){

        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }

    }
