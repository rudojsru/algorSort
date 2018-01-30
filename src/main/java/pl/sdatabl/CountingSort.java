package pl.sdatabl;

public class CountingSort {
    public static void main(String[] args) {
        int [] tab = new int[] {2,5,12, 3, 6, 1, 33, 8, 4, 9, 25,13, 18};

        int[] tab2 = counting(tab,tab.length);
        for (int elementTablicy: tab2){
            System.out.print(elementTablicy+", ");
        }
    }

    static int[] counting(int[] tab, int zakres) {
        int n = tab.length;
        int[] liczniki = new int[zakres + 1];

        for (int i = 0; i < n; i++) {
            liczniki[tab[i]]++;
        }
        int j = 0;

        for (int i = 0; i < zakres + 1; i++) {
            for (int k = 0; i < liczniki[i]; k++) {
                tab[j++] = i;
            }
        }

        return tab;
    }
}
