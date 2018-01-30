package pl.sdatabl;

import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int [] tab = new int[] {2,5,12, 3, 6, 1, 33, 8, 4, 9, 25,13, 18};

         System.out.println(Arrays.toString(insertionAlgorytm(tab)));

    }


    static int[] insertionAlgorytm(int[] tab) {
        int n = tab.length;
        for (int i = 2; i < n; i++) {
//            if (tab[i]>tab[i+1]){
//                int temporali = tab[i];
//                tab[i] = tab[i+1];
//                tab[i+1]=temporali;

            int temporali = tab[i];
            int j = i - 1;
            while (j >= 0 && tab[j] > temporali) {
                tab[j + 1] = tab[j];
                j = j - 1;
            }
            tab[j + 1] = temporali;
        }
        return tab;
    }
}
