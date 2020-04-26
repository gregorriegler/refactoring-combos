package pushuppulldown;

/**
 * 1.) push up the makeSummary statement out of the confirm method.
 * 2.) pull down the makeSummary statement back into the confirm method again.
 */
public class Start {

    public static void main(String[] args) {
        Start start = new Start();
        start.handle(new Order("Peter", "Some Street 3"));
    }

    private void handle(Order order) {
        confirm(order);
    }

    private void confirm(Order order) {
        String summary = this.makeSummary(order);
        System.out.println("confirm order for " + summary);
    }

    private String makeSummary(Order order) {
        return order.name + ", " + order.address;
    }
}

