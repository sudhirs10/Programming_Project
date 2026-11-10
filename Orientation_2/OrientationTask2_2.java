public class OrientationTask2_2 {
    public static void main(String[] args) {
        EventList eventList = new EventList();

        eventList.addEvent(new Event(12, EventType.EXIT));
        eventList.addEvent(new Event(5, EventType.ARRIVAL));
        eventList.addEvent(new Event(9, EventType.EXIT));
        eventList.addEvent(new Event(6, EventType.ARRIVAL));

        Event firstEvent = eventList.removeNextEvent();
        System.out.println("Removed: " + firstEvent.getTime() + " - " + firstEvent.getType());

        System.out.println("Remaining events:");
        eventList.printEvents();
    }
}