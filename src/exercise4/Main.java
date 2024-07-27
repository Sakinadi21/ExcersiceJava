package exercise4;

public class Main {
    public static void main(String[] args) {
        int r = 5;
        Circle circle1 = new Circle(r);
        System.out.println("Radius of the circle is " + r);
        System.out.println("The area of the circle is " + circle1.getArea());
        System.out.println("The circumference of the circle is " + circle1.getCircumference());
    }
}
