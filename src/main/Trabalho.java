package main;

import Metodos.*;

import java.util.Arrays;
import java.util.Scanner;

public class Trabalho {
    public static void main(String[] args) {
        int a = 1,
                resposta = 0,
                i = 1, metodo = 0,
                teste = 0,
                carta[] = new int[7];
        int inicio = 0;
        int fim = carta.length - 1;

        Scanner leia = new Scanner(System.in);

        for (i = 0; i < 7; i++) {
            System.out.println("Insira a carta " + a + ": ");
            teste = leia.nextInt();
            a = a + 1;

            if (teste >= 1 && teste <= 13) {
                carta[i] = teste;
            } else {
                System.out.println("Carta Invalida.");
                i = i - 1;
                a = a - 1;
            }
        }

        double tempoGastoSeg = 0;
        for (i = 0; i < 1; i++) {
            System.out.println("Selecione o metodo de organizacao: ");
            System.out.println("1 - BubbleSort ");
            System.out.println("2 - SelectionSort ");
            System.out.println("3 - InsetionSort ");
            System.out.println("4 - QuickSort");
            System.out.println("5 - HeapSort");
            System.out.println("6 - MergeSort");
            metodo = leia.nextInt();
            long inicioOrdenacao = System.nanoTime();
            if (metodo == 1) {
                System.out.println("BubbleSort");
                BubbleSort Trabalho = new BubbleSort();
                Trabalho.bolha(carta);
            } else if (metodo == 2) {
                System.out.println("SelectionSort");
                SelectionSort Trabalho = new SelectionSort();
                Trabalho.Selection(carta);
            } else if (metodo == 3) {
                System.out.println("InsetionSort");
                InsertionSort Trabalho = new InsertionSort();
                Trabalho.Insertion(carta);
            } else if (metodo == 4) {
                System.out.println("QuickSort");
                Quicksort Trabalho = new Quicksort();
                Trabalho.quickSort(carta, inicio, fim);
            } else if (metodo == 5) {
                System.out.println("HeapSort");
                HeapSort Trabalho = new HeapSort();
                Trabalho.heapSort(carta);
            } else if (metodo == 6) {
                System.out.println("MergeSort");
                MergeSort Trabalho = new MergeSort();
                Trabalho.mergeSort(carta, inicio, fim);
            } else {
                System.out.println("Invalido");
                i = i - 1;
            }
            long fimOrdenacao = System.nanoTime();
            long tempoGastoNano = fimOrdenacao - inicioOrdenacao;
            tempoGastoSeg = tempoGastoNano / 1e9;

        }
        System.out.println("Vetor ordenado: " + Arrays.toString(carta));
        System.out.println("Tempo gasto: " + tempoGastoSeg + " segundos");
    }
}