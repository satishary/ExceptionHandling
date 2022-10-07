package interfacepractice;

public class Rectangle implements Figure {

    private int length, breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double area() {
        return length * breadth;
    }

    @Override
    public double perimeter() {
        return 2 * (length + breadth);
    }

    @Override
    public String toString() {
        return "Rectangle{" + "length=" + length + ", breadth=" + breadth + '}';
    }
    

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(6, 3);
        Figure r2 = new Rectangle(6, 4);
        Circle c1=new Circle(6);
        Figure c2=new Circle(7);
//Figure f=new Figure();
        System.out.println(r2.area());
        System.out.println(r2.perimeter());
        System.out.println(c2.area());
        System.out.println(c2.perimeter());
    }
}
