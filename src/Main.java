import java.util.Scanner;

abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    private int radius;

    Circle (int a) {radius=a;}
    int getRadius() {return radius;}
    void setRadius(int a) {radius=a;}
    double area() {return Math.PI*Math.pow(radius,2);}
}

class Rectangle extends Shape {
    private int height;
    private int width;

    Rectangle(int a, int b) {
        height=a;
        width=b;
    }
    void setHeight(int a) {height=a;}
    void setWidth(int a) {width=a;}
    double area() {return height*width;}
}

class Square extends Shape {
    private int width;

    Square(int a) {width=a;}
    void setWidth(int a) {width=a;}
    double area() {return width*width;}
}

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Введите радиус окружности: ");
        Circle circle=new Circle(scan.nextInt());

        System.out.print("Введите длину и ширину для прямоугольника: ");
        Rectangle rectangle=new Rectangle(scan.nextInt(), scan.nextInt());

        System.out.print("Введите длину стороны квадрата: ");
        Square square=new Square(scan.nextInt());

        System.out.println("Площади:");
        System.out.println("О="+circle.area());
        System.out.println("П="+rectangle.area());
        System.out.println("К="+square.area());
    }
}
