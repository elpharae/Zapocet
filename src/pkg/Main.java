package pkg;

public class Main {

    public static void main(String[] args) {
	    Matice matice = new Matice(2, 10);

        try {
            matice.vypis();
            System.out.println(matice.maximumNadHD());
        } catch (NelzeUrcitException e) {
            System.out.println(e.getMessage());
        }
    }
}
