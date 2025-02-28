//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Figure triangle = new Triangle(3.9, 5.0, 7.9, "green", "blue");
        Figure rectangle = new Rectangle(3.9, 5.0, "orange", "red");
        Figure circle = new Circle(34,  "black", "pink");
        System.out.println(circle.getFillColor());
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getBoundaryColor());
    }
}