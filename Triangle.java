package dubbio;

public class Triangle extends Shape {

    @Override
    public void draw() {
        //super.draw(); //cosi chiamo draw di shape nudo e crudo
        System.out.println("siamo in triangle");
    }

    @Override
    public void perimetro() {
        int b;
        b = super.a;
        System.out.println(b);
    }


    @Override
    public void getTipo() {

    }
}
