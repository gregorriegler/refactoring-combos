package encapsulatecollection;

import java.util.ArrayList;
import java.util.List;

/**
 * encapsulate the collection and make it have a "total" method.
 */
public class Start {

    public static void main(String[] args) {
        List<OrderLine> lines = new ArrayList<>();
        lines.add(new OrderLine("computer", 999));
        lines.add(new OrderLine("table", 400));

        int total = lines.stream()
            .mapToInt(line -> line.cost)
            .sum();
        System.out.println("the total amount is " + total);
    }

}
