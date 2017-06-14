package strategy;

public class Colvert extends Canard {

    public Colvert() {
        setMaFaconDeVoler(new VolAvecAiles());
    }

    @Override
    public void afficheToi() {
        System.out.println("Je suis un Colvert !");
    }
}
