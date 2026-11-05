public class OrientationTask1_6 {
    public static void main(String[] args) {
        CustomerGenerator generator = new CustomerGenerator();

        System.out.println("Test run 1");
        ServicePoint firstServicePoint = new ServicePoint();
        generator.generateCustomers(firstServicePoint, 5);
        firstServicePoint.serve();

        System.out.println();
        System.out.println("Test run 2");
        ServicePoint secondServicePoint = new ServicePoint();
        generator.generateCustomers(secondServicePoint, 3);
        secondServicePoint.serve();
    }
}