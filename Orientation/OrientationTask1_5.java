public class OrientationTask1_5 {
    public static void main(String[] args) {
        ServicePoint servicePoint = new ServicePoint();
        CustomerGenerator generator = new CustomerGenerator();

        generator.generateCustomers(servicePoint, 3);
        servicePoint.serve();
    }
}