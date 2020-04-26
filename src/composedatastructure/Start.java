package composedatastructure;

/**
 * Compose an Order Data Structure that contains of a Customer and an address.
 * The Customer should contain of firstName and lastName.
 */
public class Start {

    public static void main(String[] args) {
        Start start = new Start();
        start.print();
    }

    private void print() {
        String firstName = "Peter";
        String lastName = "Huber";
        String address = "Some Street 3";

        System.out.println("print order for " + firstName + ", " + lastName + ", " + address);
    }

}
