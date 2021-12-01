package pkg;

import java.util.Scanner;

public class Main {

    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        int rozmerMatice = 0;
        while (!(rozmerMatice > 0 && rozmerMatice <= 10)) {
            System.out.print("Zadej rozměr matice: ");
            rozmerMatice = Main.SC.nextInt();
        }
        System.out.print("Zadej hranici intervalu: ");
        int hraniceIntervalu = Math.abs(Main.SC.nextInt());

        try {
            Matice matice = new Matice(rozmerMatice, hraniceIntervalu);
            matice.vypis();
            System.out.println(matice.maximumNadHD());
        } catch (NelzeUrcitException e) {
            System.out.println(e.getMessage());
        }
    }
}
