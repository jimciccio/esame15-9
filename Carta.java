package dubbio;

public class Carta implements ElementoSupporto{
    ElementoSupporto elementoSupporto = null;

    public void setI(ElementoSupporto i) { this.elementoSupporto = i; }


    public Carta(ElementoSupporto i){
        setI(i); }

    public void scrivi() {
        elementoSupporto.scrivi();
    }

    public void leggi(){elementoSupporto.leggi();}

    public void cancella() {


        elementoSupporto.cancella();
    }

    @Override
    public void vedi() {

    }
}
