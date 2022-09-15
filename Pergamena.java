package dubbio;

abstract public class Pergamena implements ElementoSupporto{
    @Override
    public void scrivi() {
        System.out.println("sto scrivendo su pergamena");
    }

    @Override
    public void leggi() {
        System.out.println("sto leggendo la pergamena");
    }


}
