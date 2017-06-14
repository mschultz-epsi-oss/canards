import strategy.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Canard> canards = new ArrayList<>();
        canards.add(new Colvert());
        canards.add(new Morillon());
        Canard cb = new CanardEnBois();
        canards.add(cb);
        canards.add(new AdapterDindonToCanard(new Dodo()));

        for (Canard c : canards) {
            c.afficheToi();
            c.envoleToi();
            System.out.println(" -- ");
        }

        cb.setMaFaconDeVoler(new VolAvecAiles());

        for(Canard c : canards){
            c.afficheToi();
            c.envoleToi();
            System.out.println(" -- ");
        }
    }
}
