import eduni.distributions.Negexp;

public class ArrivalProcess {
    private final Negexp generator;
    private final EventType eventType;

    public ArrivalProcess(Negexp generator, EventType eventType) {
        this.generator = generator;
        this.eventType = eventType;
    }

    public double generateNextEvent(EventList eventList) {
        double gap = generator.sample();
        double arrivalTime = Clock.getInstance().getTime() + gap;

        Event event = new Event(arrivalTime, eventType);
        eventList.addEvent(event);

        return arrivalTime;
    }
}