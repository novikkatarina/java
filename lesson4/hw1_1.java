package lesson4;

import java.util.ArrayList;
import java.util.Random;

public class hw1_1 {
    public static ArrayList<Integer> QuickSort(ArrayList<Integer> array) {
        if (array.size() < 2)
            return array;

        ArrayList<Integer> low = new ArrayList<>();
        ArrayList<Integer> same = new ArrayList<>();
        ArrayList<Integer> high = new ArrayList<>();

        Integer pivot = array.get(new Random().nextInt(array.size() - 1));

        for (var item : array) {
            if (item < pivot)
                low.add(item);
            else if (item.equals(pivot)) {
                same.add(item);
            } else {
                high.add(item);
            }
        }

        return QuickSort(low);
    }
}
