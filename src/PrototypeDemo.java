/**
 * Prototype pattern demo
 * Shape - prototype, Circle and Rectangle - concrete prototypes
 *
 * Feb 2019 Evgeny Tyurin
 */

public class PrototypeDemo {

    /** Show clone mechanism in action - copy source and report */
    private static void cloneTest(Shape source) {
        System.out.println("Original:" + source);
        Shape copy = source.clone();
        System.out.println("Copy    :" + copy);
    }

    /** Run point */
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(0, 0, 10, 10);
        cloneTest(rectangle);
        Circle circle = new Circle(10, 10, 15);
        cloneTest(circle);
    }
}
