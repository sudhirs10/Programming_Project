public class OrientationTask1_3 {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.setStartTime(100);
        customer1.setEndTime(350);

        Customer customer2 = new Customer();
        customer2.setStartTime(200);
        customer2.setEndTime(500);

        System.out.println("Customer ID: " + customer1.getId());
        System.out.println("Time spent: " + customer1.getTimeSpent() + " ms");

        System.out.println("Customer ID: " + customer2.getId());
        System.out.println("Time spent: " + customer2.getTimeSpent() + " ms");
    }
}