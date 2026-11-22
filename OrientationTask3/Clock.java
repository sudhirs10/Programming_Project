public class Clock {
    private static final Clock instance = new Clock();
    private double time = 0.0;

    private Clock() {
    }

    public static Clock getInstance() {
        return instance;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }
}