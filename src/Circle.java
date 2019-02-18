public class Circle extends Shape {

    private int radius;

    Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    private Circle(Circle source) {
        super(source);
        radius = source.radius;
    }

    @Override
    protected Shape clone() {
        return new Circle(this);
    }

    @Override
    public String toString() {
        return "Circle x=" + x + " y=" + y + " radius=" + radius;
    }
}

