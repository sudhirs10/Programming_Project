public class Event implements Comparable<Event> {
    private int time;
    private EventType type;

    public Event(int time, EventType type) {
        this.time = time;
        this.type = type;
    }

    public int getTime() {
        return time;
    }

    public EventType getType() {
        return type;
    }

    @Override
    public int compareTo(Event other) {
        if (time < other.getTime()) {
            return -1;
        } else if (time > other.getTime()) {
            return 1;
        } else {
            return 0;
        }
    }
}