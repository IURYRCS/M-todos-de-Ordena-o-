package Metodos;

public class BubbleSort {
    public static void bolha(int[] carta) {
        int n = carta.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (carta[j] > carta[j+1]) {
                    int temp = carta[j];
                    carta[j] = carta[j+1];
                    carta[j+1] = temp;
                    System.out.println("[" + carta[0] + "," + carta[1] + "," + carta[2] + "," + carta[3] + "," + carta[4] + "," + carta[5] + "," + carta[6] + "]");
                }
            }
        }
    }
}
