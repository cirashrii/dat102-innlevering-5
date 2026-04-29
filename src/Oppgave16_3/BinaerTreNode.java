package Oppgave16_3;

public class BinaerTreNode<T> {

    private T element;
    private BinaerTreNode<T> venstre;
    private BinaerTreNode<T> hoyre;

    private int hogdeU;

    public BinaerTreNode(T elem) {
        element = elem;
        venstre = null;
        hoyre = null;

        hogdeU = 1;
    }

    public T getElement() {
        return element;
    }

    public BinaerTreNode<T> getVenstre() {
        return venstre;
    }

    public BinaerTreNode<T> getHoyre() {
        return hoyre;
    }

    public void setVenstre(BinaerTreNode<T> v) {
        venstre = v;
    }

    public void setHoyre(BinaerTreNode<T> h) {
        hoyre = h;
    }

    public int getHogdeU() {
        return hogdeU;
    }

    public void setHogdeU(int h) {
        hogdeU = h;
    }

    /* Denne metoden må flyttes til BS_Tre:

    public boolean erBalansert() {
        return erBalansertRek(rot);
    }

    private boolean erBalansertRek(BinaerTreNode<T> p) {

        if (p == null) {
            return true;
        }

        int venstreHoyde = 0;
        int hoyreHoyde = 0;

        if (p.getVenstre() != null) {
            venstreHoyde = p.getVenstre().getHogdeU();
        }

        if (p.getHoyre() != null) {
            hoyreHoyde = p.getHoyre().getHogdeU();
        }

        if (Math.abs(venstreHoyde-hoyreHoyde) > 1) {
            return false;
        }

        return erBalansertRek(p.getVenstre()) && erBalansertRek(p.getHoyre());
    }*/
}
