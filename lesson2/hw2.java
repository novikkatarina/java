package lesson2;

import java.lang.reflect.Array;
import java.util.Scanner;

public class hw2 {
    public static void insertsort(int[] arr, int n){
        for (int i = 0; i < n; i++){
            int keyitem = arr[i];
            int j = i - 1;
            while ((j >= 0) && (arr[j] > keyitem)){
                arr[j+1] = arr[j];
                arr[j] = keyitem;
                j -= 1;
            }
            }
        System.out.print("sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");}

    }
    public static void main(String[] args){
    // int n = 5;
    // int[] arrayforsort = {1, 5, 4, 3, 7};
    Scanner iScanner = new Scanner(System.in);
    System.out.printf("Количество элементов: ");
    String n1 = iScanner.nextLine();
    int n = Integer.valueOf(n1);
    int[] arrayforsort = new int[n];
    for (int i = 0; i < n; i++) {
        String it = iScanner.nextLine();
        arrayforsort[i] = Integer.valueOf(it);
    }
    iScanner.close();
    System.out.print("unsorted array: ");
    for (int i = 0; i < n; i++) {
        System.out.print(arrayforsort[i] + " ");
    }
    System.out.println();
    insertsort (arrayforsort, n);
    }
    
}
