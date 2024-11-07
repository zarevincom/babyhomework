public class Clock implements Readable {
    private int hours;
    private int minutes;
    private int seconds;

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public void tick() {
        setSeconds(this.seconds+1);
    }

    @Override
    public void readTime() {
        System.out.printf("Время: %d часов %d минут %d секунд\n", getHours(), getMinutes(), getSeconds());
    }
}
