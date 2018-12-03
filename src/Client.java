public class Client extends Observer {

    public Client(OrderStrategy orderStatus){
        this.orderStatus = orderStatus;
        this.orderStatus.attach(this);

    }

    @Override
    public void update() {
        System.out.println("Order is "+orderStatus.getState());
}

}
