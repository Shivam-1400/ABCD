package Lakshya;

import java.lang.Math;
interface Polygon
{
    void getArea();

    default void getPerimeter(int... sides)
    {
        int perimeter = 0;
        for (int side: sides)
    {
        perimeter += side;
    }
        System.out.println("Perimeter: " + perimeter);
    }
}
class Triangle implements Polygon
{
    private int a, b, c;
    private double s, area;
    Triangle(int a, int b, int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        s = 0;
    }
    public void getArea()
    {
        s = (double) (a + b + c)/2;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Triangle:");
        System.out.println("Area: " + area);
    }
}
class Square implements Polygon
{
    private int a,b,c,d;
    private double area;
    Square(int a, int b, int c, int d)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    public void getArea()
    {
        area = a*b;
        System.out.println("Square:");
        System.out.println("Area: "+ area);
    }
}
public class Mainn {


    public static void main(String[] args)
    {
        Triangle t1 = new Triangle(3, 4, 5);
        t1.getArea();
        t1.getPerimeter(3, 4, 5);
        Square s1= new Square(5,5,5,5);
        s1.getArea();
        s1.getPerimeter(5,5,5,5);
    }
}