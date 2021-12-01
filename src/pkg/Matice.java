package pkg;

import java.util.Random;

public class Matice {

    private final int MISTO_V_BUNCE = 4;

    private final int ROZMER_MATICE;
    private final int HRANICE_INTERVALU;

    private int[][] matice;

    public Matice(int rozmerMatice, int hraniceIntervalu) {
        this.HRANICE_INTERVALU = hraniceIntervalu;
        this.matice = new int[rozmerMatice][rozmerMatice];
        this.ROZMER_MATICE = this.matice.length;

        Random rn = new Random();

        for (int i = 0; i < this.ROZMER_MATICE; i++)
            for (int j = 0; j < this.ROZMER_MATICE; j++)
                this.matice[i][j] = rn.nextInt(this.HRANICE_INTERVALU * 2) - this.HRANICE_INTERVALU + 1;
    }

    public void vypis() {
        for (int i = 0; i < this.matice.length; i++) {
            System.out.print("|");
            for (int j = 0; j < this.matice[i].length; j++) {
                for (int k = 0; k < this.MISTO_V_BUNCE - Integer.toString(this.matice[i][j]).trim().length(); k++) System.out.print(" ");
                System.out.print(this.matice[i][j]);
            }
            System.out.println("|");
        }
    }

    public int maximumNadHD() throws NelzeUrcitException {
        if (this.ROZMER_MATICE == 1) throw new NelzeUrcitException("Pro matici o rozmeru " + this.ROZMER_MATICE + " maximum nad HD nelze urcit");

        int max = -this.HRANICE_INTERVALU;
        for (int i = 0; i < this.ROZMER_MATICE; i++)
            for (int j = i + 1; j < this.ROZMER_MATICE; j++) //j = i + 1 => mimo hlavni diagonalu.. pro zahrnuti i hodnot na diagonale -> j = i
                if (max < this.matice[i][j]) max = this.matice[i][j];

        return max;
    }

}
