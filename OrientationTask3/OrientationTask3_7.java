import eduni.distributions.Negexp;

public class OrientationTask3_7 {
    public static void main(String[] args) {
        Clock clock = Clock.getInstance();
        clock.setTime(0.0);

        EventList eventList = new EventList();
        ArrivalProcess arrivals = new ArrivalProcess(
                new Negexp(3.0), EventType.ARRIVAL);
        ServicePoint servicePoint = new ServicePoint();

        for (int i = 0; i < 10; i++) {
            double arrivalTime = arrivals.generateNextEvent(eventList);
            clock.setTime(arrivalTime);
        }

        for (int i = 0; i < 10; i++) {
            Event event = eventList.removeNextEvent();
            Customer customer = new Customer();
            customer.setSimulatedArrivalTime(event.getTime());
            servicePoint.addSimulatedCustomer(customer);
        }

        clock.setTime(clock.getTime() + 5.0);
        double departureTime = clock.getTime();

        for (int i = 0; i < 10; i++) {
            Customer customer = servicePoint.removeFromQueueue();
            double timeInSystem = departureTime - customer.getSimulatedArrivalTime();

            System.out.printf("Customer %d spent %.2f time units in the system%n",
                    customer.getId(), timeInSystem);
        }
    }
}