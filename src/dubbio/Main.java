package dubbio;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Shape shape;
        Triangle triangle = new Triangle();
        triangle.perimetro();
        shape=triangle;
        shape.draw();
        Circle circle=new Circle();
        shape=circle;
        shape.draw();


    }
}
