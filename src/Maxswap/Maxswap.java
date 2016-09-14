package Maxswap;

import java.util.Scanner;

public class Maxswap {
    public static void main(String[] args) {
        int MAXVALUE = 35;
        int sum = 0;
        int count = 0;
        int a;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        a = in.nextInt();

        int[] arr = new int[a];

        for (int i = 0; i < arr.length; i++) {
                System.out.print("Введите элемент arr[" + i + "]:");
                arr[i] = in.nextInt();

        }
        in.close();

        System.out.print("Массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int k;
        int max = arr[0];
        for (k = 0; k < a; k++) {
                if (arr[k] > max)
                    max = arr[k];

        }
        System.out.println("Максимальное значение: " + max);
    }
}
