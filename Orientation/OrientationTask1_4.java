import java.util.LinkedList;
import java.util.Scanner;

public class OrientationTask1_4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        LinkedList<Customer> queue = new LinkedList<>();

        boolean running = true;

        while (running) {
            System.out.println();
            System.out.println("1. Add customer");
            System.out.println("2. Remove customer");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            String choice = reader.nextLine();

            if (choice.equals("1")) {
                Customer customer = new Customer();
                customer.setStartTime(System.nanoTime());
                queue.addFirst(customer);

                System.out.println("Customer " + customer.getId() + " joined the queue.");
            } else if (choice.equals("2")) {
                if (queue.isEmpty()) {
                    System.out.println("The queue is empty.");
                } else {
                    Customer customer = queue.removeLast();
                    customer.setEndTime(System.nanoTime());

                    long waitingTime = customer.getTimeSpent();

                    System.out.println("Customer " + customer.getId() + " left the queue.");
                    System.out.println("Time in queue: " + waitingTime + " ns");
                }
            } else if (choice.equals("3")) {
                running = false;
            } else {
                System.out.println("Please enter 1, 2, or 3.");
            }
        }

        reader.close();
    }
}