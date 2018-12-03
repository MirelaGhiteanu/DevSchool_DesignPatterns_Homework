public class Curier extends Observer {

    public Curier(OrderStrategy orderStatus){
        this.orderStatus = orderStatus;
        this.orderStatus.attach(this);
    }

    public void update(){
        System.out.println("Order is "+orderStatus.getState());
    }
}
