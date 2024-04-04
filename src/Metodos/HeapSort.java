package Metodos;

public class HeapSort {
    public static void heapSort(int[] carta) {
        int n = carta.length;


        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(carta, n, i);
        }


        for (int i = n - 1; i > 0; i--) {

            int temp = carta[0];
            carta[0] = carta[i];
            carta[i] = temp;


            heapify(carta, i, 0);
        }

    }

    public static void heapify(int[] carta, int n, int i) {
        int maior = i;
        int esq = 2 * i + 1;
        int dir = 2 * i + 2;


        if (esq < n && carta[esq] > carta[maior]) {
            maior = esq;
        }


        if (dir < n && carta[dir] > carta[maior]) {
            maior = dir;
        }


        if (maior != i) {
            int temp = carta[i];
            carta[i] = carta[maior];
            carta[maior] = temp;


            heapify(carta, n, maior);
        }
        System.out.println("[" + carta[0] + "," + carta[1] + "," + carta[2] + "," + carta[3] + "," + carta[4] + "," + carta[5] + "," + carta[6] + "]");
    }
}
