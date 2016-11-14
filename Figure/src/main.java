/**
 * by Anastasia Lebedeva on 11.11.2016.
 */
public class main {

    public static void main (String[] args){

        Circle circle = new Circle(3.0);
        Square square = new Square(5.0);
        Triangle triangle = new Triangle(4.0, 6.0);

        System.out.println (circle.getArea());
        System.out.println (square.getArea());
        System.out.println(triangle.getArea());
    }

}
