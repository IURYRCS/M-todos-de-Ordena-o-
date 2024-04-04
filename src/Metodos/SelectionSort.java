package Metodos;

public class SelectionSort {
    public static void Selection (int[] carta) {
        int n = carta.length;
        for (int i = 0; i < n - 1; i++) {
            // Encontra o menor elemento no subarray não ordenado
            int indiceDoMenor = i;
            for (int j = i + 1; j < n; j++) {
                if (carta[j] < carta[indiceDoMenor]) {
                    indiceDoMenor = j;
                }
            }

            int temp = carta[indiceDoMenor];
            carta[indiceDoMenor] = carta[i];
            carta[i] = temp;
            System.out.println("[" + carta[0] + "," + carta[1] + "," + carta[2] + "," + carta[3] + "," + carta[4] + "," + carta[5] + "," + carta[6] + "]");
        }
    }
}