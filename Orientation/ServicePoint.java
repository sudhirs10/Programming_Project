import java.util.LinkedList;

public class ServicePoint {
    private LinkedList<Customer> queue = new LinkedList<>();

    public void addToQueueue(Customer customer) {
        customer.setStartTime(System.nanoTime());
        queue.addFirst(customer);
    }

    public Customer removeFromQueueue() {
        return queue.removeLast();
    }

    public void serve() {
        long totalServiceTime = 0;
        int customersServed = 0;

        while (!queue.isEmpty()) {
            Customer customer = removeFromQueueue();
            long serviceTime = (long) (Math.random() * 501) + 500;

            try {
                Thread.sleep(serviceTime);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }

            customer.setEndTime(System.nanoTime());
            long responseTime = customer.getTimeSpent() / 1000000;

            totalServiceTime = totalServiceTime + serviceTime;
            customersServed = customersServed + 1;

            System.out.println("Customer " + customer.getId());
            System.out.println("Service time: " + serviceTime + " ms");
            System.out.println("Response time: " + responseTime + " ms");
            System.out.println();
        }

        if (customersServed > 0) {
            double averageServiceTime = (double) totalServiceTime / customersServed;
            System.out.printf("Average service time: %.2f ms%n", averageServiceTime);
        }
    }
}