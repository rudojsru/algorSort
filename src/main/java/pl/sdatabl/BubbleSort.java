package pl.sdatabl;

public class BubbleSort {
    public static void main(String[] args) {

        int [] tab = new int[] {2,5,12, 3, 6, 1, 33, 8, 4, 9, 25,13, 18};

        for (int elementTablicy: tab){
            System.out.print(elementTablicy+", ");
        }
        System.out.println();

        int []newTab = sort2(tab);

        for (int elementTablicy: newTab){
            System.out.print(elementTablicy+", ");
        }

    }

    public static int[] sort(int[] tablica) {
        int n = tablica.length;
        do {
            for (int i = 0; i < n - 1; i++) {
                if (tablica[i] > tablica[i + 1]) {
                    int a = tablica[i];
                    tablica[i] = tablica[i + 1];
                    tablica[i + 1] = a;
                }
            }
            n = n - 1;
        }        while (n>1);
        return tablica;
    }

    public static int [] sort2 (int[] tablica){
        int n= tablica.length;

        for (int j=0 ; j<n;j++){
            for (int i=0 ; i<n-1-j;i++){
                if (tablica[i]>tablica[i+1]) {
                    int a = tablica[i];
                    tablica[i] =tablica [i+1];
                    tablica[i+1] =a;
                }
            }
        }
        return tablica;
    }
}


