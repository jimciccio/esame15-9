package dubbio;

public class Pietra implements ElementoSupporto{
    @Override
    public void scrivi() {
        System.out.println("scrivo su pietra");
    }

    @Override
    public void leggi() {
        System.out.println("leggo su pietra");

    }

    @Override
    public void cancella() {
        System.out.println("cancello la pietra");

    }
    @Override
    public void vedi(){

    }
}
