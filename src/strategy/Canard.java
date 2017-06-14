package strategy;

public abstract class Canard {
    private Vol maFaconDeVoler;

    abstract public void afficheToi();

    public void nage() {
        System.out.println("Je nage !");
    }

    public void faisCoinCoin() {
        System.out.println("Coin coin !");
    }

    public void envoleToi() {
        maFaconDeVoler.vole();
    }

    public Vol getMaFaconDeVoler() {
        return maFaconDeVoler;
    }

    public void setMaFaconDeVoler(Vol maFaconDeVoler) {
        this.maFaconDeVoler = maFaconDeVoler;
    }
}
