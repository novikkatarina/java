package lesson4;//Реализовать алгоритм быстрой сортировки

import java.util.Arrays;

public class hw1 {

    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;
        if (low >= high)
            return;

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int pivot = array[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }

            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }
    public static void main(String[] args) {
        int[] x = { 4, 7, 2, -3, 6, 3 };
        System.out.println("Initial");
        System.out.println(Arrays.toString(x));

        int low = 0;
        int high = x.length - 1;

        quickSort(x, low, high);
        System.out.println("Sorted");
        System.out.println(Arrays.toString(x));
    }
}