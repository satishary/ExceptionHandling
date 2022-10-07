package interfacepractice;

public class Circle implements Figure {

    public int radius;

    public Circle(int radius) {
        this.radius = radius;

    }

    @Override
    public double area() {
        return Math.PI* radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI* radius ;  //perimeter of circle (2 pie r)
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }

    public static void main(String args[]) {
        Circle c1 = new Circle(7);
        Figure c2 = new Circle(8);
        System.out.println(c2.area());
        System.out.println(c2.perimeter());
    }

}
