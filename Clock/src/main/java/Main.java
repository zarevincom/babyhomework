public class Main {
    public static void main(String[] args) {
        Clock clock = new Clock();
        clock.setHours(5);
        clock.setMinutes(30);
        clock.setSeconds(49);
        clock.tick();
        clock.readTime();
    }
}
