public class ClockTest {
    public static void main(String[] args) {
        Clock clock = Clock.getInstance();
        System.out.println("Starting time: " + clock.getTime());

        clock.setTime(5.5);

        Clock sameClock = Clock.getInstance();
        System.out.println("Updated time: " + sameClock.getTime());
        System.out.println("Same clock: " + (clock == sameClock));
    }
}