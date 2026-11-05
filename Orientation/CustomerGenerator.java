public class CustomerGenerator {
    public void generateCustomers(ServicePoint servicePoint, int numberOfCustomers) {
        for (int i = 0; i < numberOfCustomers; i++) {
            Customer customer = new Customer();
            servicePoint.addToQueueue(customer);
        }
    }
}