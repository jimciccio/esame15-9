package dubbio;

abstract public  class Shape implements OggettoGeometrico {
    public int a = 2;

    protected Shape(){
        System.out.println("costruttore shape");
    }

    public void Shape(int a){
        System.out.println("costruttore specifico shape");
        System.out.println(a);
    }

    public abstract void draw();

    public void cancel(){
        System.out.println("cancel di shape");
    }

    public abstract void perimetro();
}
