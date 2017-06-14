package strategy;

public class Morillon extends Canard {

    public Morillon() {
        setMaFaconDeVoler(new VolAvecAiles());
    }

    @Override
    public void afficheToi() {
        System.out.println("Je suis un Morillon !");
    }
}