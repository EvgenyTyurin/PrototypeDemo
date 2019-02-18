/**
 * Abstract shape
 */

class Shape {
    // Coordinates
    int x, y;

    // Standard constructor
    Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Clone constructor
    Shape (Shape source) {
        this(source.x, source.y);
    }

    // Clone mechanism
    protected Shape clone() {
        return new Shape(this);
    }

}
