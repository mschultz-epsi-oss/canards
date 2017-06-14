package strategy;

public class NoVol implements Vol {

    @Override
    public void vole() {
        System.out.println("Je ne vole pas !");
    }
}