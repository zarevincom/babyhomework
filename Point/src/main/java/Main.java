public class Main {
    public static void main(String[] args) {
        Point coords = new Point();
        coords.setX(-1);
        coords.setY(2);
        coords.moveUp();
        coords.moveLeft();
        System.out.println(coords.getX());
        System.out.println(coords.getY());
    }
}
