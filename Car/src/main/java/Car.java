public class Car implements Drivable {
    private String title;
    private String model;
    private int year;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void start() {
        System.out.println("Двигатель заведён");
    }

    @Override
    public void stop() {
        System.out.println("Двигатель выключен");
    }

    @Override
    public void drive(int distance) {
        System.out.printf("Машина проехала %d километров", distance);
    }
}
