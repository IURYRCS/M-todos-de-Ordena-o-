package Metodos;

public class MergeSort {
    public static void mergeSort(int[] carta, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;


            mergeSort(carta, inicio, meio);
            mergeSort(carta, meio + 1, fim);


            merge(carta, inicio, meio, fim);
            System.out.println("[" + carta[0] + "," + carta[1] + "," + carta[2] + "," + carta[3] + "," + carta[4] + "," + carta[5] + "," + carta[6] + "]");
        }
    }

    public static void merge(int[] array, int inicio, int meio, int fim) {
        int tamanhoEsquerda = meio - inicio + 1;
        int tamanhoDireita = fim - meio;


        int[] esquerda = new int[tamanhoEsquerda];
        int[] direita = new int[tamanhoDireita];


        for (int i = 0; i < tamanhoEsquerda; ++i) {
            esquerda[i] = array[inicio + i];
        }
        for (int j = 0; j < tamanhoDireita; ++j) {
            direita[j] = array[meio + 1 + j];
        }


        int i = 0, j = 0;


        int k = inicio;
        while (i < tamanhoEsquerda && j < tamanhoDireita) {
            if (esquerda[i] <= direita[j]) {
                array[k] = esquerda[i];
                i++;
            } else {
                array[k] = direita[j];
                j++;
            }
            k++;
        }


        while (i < tamanhoEsquerda) {
            array[k] = esquerda[i];
            i++;
            k++;
        }


        while (j < tamanhoDireita) {
            array[k] = direita[j];
            j++;
            k++;
        }
    }
}
