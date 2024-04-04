package Metodos;

public class Quicksort {

    public static void quickSort(int[] carta, int inicio, int fim) {
        if (inicio < fim) {
            int indicePivot = particiona(carta, inicio, fim);
            quickSort(carta, inicio, indicePivot - 1);
            quickSort(carta, indicePivot + 1, fim);

        }
    }

    public static int particiona(int[] carta, int inicio, int fim) {
        int pivot = carta[fim];
        int i = inicio - 1;
        for (int j = inicio; j < fim; j++) {
            if (carta[j] < pivot) {
                i++;
                int temp = carta[i];
                carta[i] = carta[j];
                carta[j] = temp;
            }

        }
        System.out.println("[" + carta[0] + "," + carta[1] + "," + carta[2] + "," + carta[3] + "," + carta[4] + "," + carta[5] + "," + carta[6] + "]");
        int temp = carta[i + 1];
        carta[i + 1] = carta[fim];
        carta[fim] = temp;
        return i + 1;
    }
}

