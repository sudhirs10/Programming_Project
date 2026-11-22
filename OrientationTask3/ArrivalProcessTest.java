import eduni.distributions.Negexp;

public class ArrivalProcessTest {
    public static void main(String[] args) {
        Clock clock = Clock.getInstance();
        clock.setTime(0.0);

        EventList eventList = new EventList();
        ArrivalProcess arrivals = new ArrivalProcess(
                new Negexp(3.0), EventType.ARRIVAL);

        for (int i = 0; i < 10; i++) {
            double arrivalTime = arrivals.generateNextEvent(eventList);
            clock.setTime(arrivalTime);
        }

        eventList.printEvents();
        System.out.println("Clock time: " + clock.getTime());
    }
}