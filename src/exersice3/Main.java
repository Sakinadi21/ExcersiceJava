package exersice3;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(7, 17);
        System.out.println("The area of the rectangle is " + rectangle1.getArea());
        System.out.println("The perimeter of the rectangle is " + rectangle1.getPerimeter());

        rectangle1.setWidth(6);
        rectangle1.setHeight(12);

        System.out.println("\nThe area of the rectangle is now " + rectangle1.getArea());
        System.out.println("The perimeter of the rectangle is now " + rectangle1.getPerimeter());
    }
}
