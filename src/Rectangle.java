class Rectangle extends Shape {
    private int width, height;

    Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    private Rectangle(Rectangle source) {
        super(source);
        this.width = source.width;
        this.height = source.height;
    }

    @Override
    protected Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public String toString() {
        return "Rectangle x=" + x + " y=" + y + " width=" + width +
                " height=" + height;
    }

}
