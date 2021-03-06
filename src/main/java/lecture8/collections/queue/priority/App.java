package lecture8.collections.queue.priority;

public class App {
    public static void main(String[] args) {
        Market market = new Market();

        market.addCustomer(new Customer("first"));
        market.addCustomer(new Customer("second"));
        market.addCustomer(new Customer("first VIP", Status.VIP));
        market.addCustomer(new Customer("third"));
        market.addCustomer(new Customer("fourth"));
        market.addCustomer(new Customer("second Vip", Status.VIP));

        for (int i = 0; i < 3; i++){
            System.out.println(market.getNextCustomer());
        }

        market.addCustomer(new Customer("new VIP", Status.VIP));

        while (market.hasNext()) {
            System.out.println(market.getNextCustomer());
        }

    }
}
