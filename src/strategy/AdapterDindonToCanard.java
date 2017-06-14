package strategy;

/**
 * Created by melvin on 01/06/17.
 */
public class AdapterDindonToCanard extends Canard {
    private Dindon dindon;

    public AdapterDindonToCanard(Dindon d) {
        dindon = d;
    }

    @Override
    public void afficheToi() {
        System.out.println("Je suis un dindon-canard !");
    }

    @Override
    public void envoleToi() {
        this.dindon.deplaceToi();
    }
}
