
package interfacepractice;


public class Triangle implements Figure {
    private int a,b,c;
    
    public Triangle(int a,int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
        
    }
    @Override
    public double area(){
        double s=(a+b+c)/2.0;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    @Override
    public double perimeter(){
        return(a+b+c);
    }

    @Override
    public String toString() {
        return "Triangle{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }
    public static void main(String args[]){
        Triangle t1=new Triangle(6,5,4);
        Figure t2=new Triangle(4,3,5);
        System.out.println(t2.area());
        System.out.println(t2.perimeter());
    }

}