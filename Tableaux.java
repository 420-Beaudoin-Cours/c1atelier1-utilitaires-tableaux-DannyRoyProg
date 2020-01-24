import java.util.Scanner;

/**
 * @author France Beaudoin
 */
public class Tableaux {

    private static void permute(int[] tab, int i1, int i2){
        int transit = tab[i1];
        tab[i1] = tab[i2];
        tab[i2] = transit;
    }

    private static void permute(String[] tab, int i1, int i2){
        String transit = tab[i1];
        tab[i1] = tab[i2];
        tab[i2] = transit;
    }

    public static void trierCroissantSSS(int[] tab){
        int imin;
        for (int i=0; i<tab.length-1; i++){
            imin = i;
            for (int j=i+1; j<tab.length; j++){
                if (tab[j] < tab[imin])
                    imin = j;
            }
            if (imin != i)
                permute(tab, i, imin);
        }
    }

    public static void trierCroissantSSS(String[] tab){
        int imin;
        for (int i=0; i<tab.length-1; i++){
            imin = i;
            for (int j=i+1; j<tab.length; j++){
                if (Integer.parseInt(tab[j]) < Integer.parseInt(tab[imin]))
                    imin = j;
            }
            if (imin != i)
                permute(tab, i, imin);
        }
    }

    public static void trierDeCroissantSSS(int[] tab){
        int imin;
        for (int i=0; i<tab.length-1; i++){
            imin = i;
            for (int j=i+1; j<tab.length; j++){
                if (tab[j] > tab[imin])
                    imin = j;
            }
            if (imin != i)
                permute(tab, i, imin);
        }
    }

    public static int maximum(int[] tab){
        int maximum = tab[0];

        for (int i = 1; i<tab.length; i++){
            if (tab[i] > maximum)
                maximum= tab[i];
        }
        return maximum;
    }

    public static int minimum(int[] tab){
        int minimum = tab[0];

        for (int i = 1; i<tab.length; i++){
            if (tab[i] < minimum)
                minimum= tab[i];
        }
        return minimum;
    }

    public static double moyenne(int[] tab){
        double somme = 0;
        double moyenne = 0;

        for(int i=0; i < tab.length ; i++) {
            somme = somme + tab[i];
        }
        moyenne = somme / tab.length;

        return moyenne;
    }

    public static int fouilleSeq(int[] tab, int fouille){
        int i = 0;
        boolean trouve = false;

        while (i < tab.length && !trouve){
            if (tab[i] == fouille)
                trouve = true;
            else
                i++;
        }
        if (trouve)
            return i;
        else
            return -1;
    }
}
