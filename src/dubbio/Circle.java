package dubbio;

public class Circle extends Shape{


    public static final int a=2;
    public Circle(){
        System.out.println("costruttore circle");
    }


    @Override
    public void draw() {
        //super.draw();
        System.out.println("siamo in circle");
    }

    @Override
    public void cancel() {
        //super.cancel();
        System.out.println("cancel di circle");
    }

    @Override
    public void perimetro() {
        this.cancel();
        calculateRadius();
    }

    public static void calculateRadius(){
        System.out.println("360");
    }

    @Override
    public void getTipo() {

    }
}
