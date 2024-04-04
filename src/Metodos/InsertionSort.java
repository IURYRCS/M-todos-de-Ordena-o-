package Metodos;

public class InsertionSort {
    public static void Insertion (int[] carta) {
        int n = carta.length;
        for (int i = 1; i < n; i++) {
            int chave = carta[i];
            int j = i - 1;

            while (j >= 0 && carta[j] > chave) {
                carta[j + 1] = carta[j];
                j = j - 1;
            }
            carta[j + 1] = chave;
            System.out.println("[" + carta[0] + "," + carta[1] + "," + carta[2] + "," + carta[3] + "," + carta[4] + "," + carta[5] + "," + carta[6] + "]");
        }
    }
}