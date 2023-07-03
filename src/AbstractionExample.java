abstract class Shape
{
    abstract public double perimeter();
    abstract public double area();
}

class Circle extends Shape
{
    double radius;

    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double area()
    {
        return Math.PI*radius*radius;
    }

}

class Rectangle1 extends Shape
{
    double length;
    double breadth;

    public double perimeter()
    {
        return 2*(length+breadth);
    }
    public double area()
    {
        return length*breadth;
    }

}

public class AbstractionExample
{
    public static void main(String[] args)
    {
        Rectangle1 r=new Rectangle1();
        r.length=10;
        r.breadth=5;

        Shape s=r;

        System.out.println(s.area());

    }
}