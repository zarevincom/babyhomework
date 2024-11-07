public class Point implements Movable {
    private int x;
    private int y;

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return this.x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return this.y;
    }

    @Override
    public void moveDown() {
        this.y -= 1;
        System.out.println("Вы сместили точку Y на 1 позицию вниз");
    }

    @Override
    public void moveUp() {
        this.y += 1;
        System.out.println("Вы сместили точку Y на 1 позицию вверх");
    }

    @Override
    public void moveLeft() {
        this.x -= 1;
        System.out.println("Вы сместили точку X на 1 позицию влево");
    }

    @Override
    public void moveRight() {
        this.x += 1;
        System.out.println("Вы сместили точку X на 1 позицию вправо");
    }
}
