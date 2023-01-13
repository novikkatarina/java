package lesson4;

import java.util.ArrayList;
import java.util.List;

public class HW_quick_sort {
    public static ArrayList<Integer> quickSort(ArrayList<Integer> arr){

        if (arr.size() <2) return arr;

        ArrayList<Integer> low  = new ArrayList<>();
        ArrayList<Integer> middle  = new ArrayList<>();
        ArrayList<Integer> high  = new ArrayList<>();
        int i = arr.size()/2;
        int pivot = arr.get(i);
        for (var item : arr) {
            if (item < pivot)
                low.add(item);
            if (item == pivot)
                middle.add(item);
            if (item > pivot)
                high.add(item);
        }
//        }
        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(quickSort(low));
        result.addAll(middle);
        result.addAll(quickSort(high));
        return result;
    }
    public static void main (String[] args){
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i<6; i++){
             array.add((int)(Math.random() * 10));}
        System.out.println(array);
        System.out.println(quickSort(array));
        }

}
