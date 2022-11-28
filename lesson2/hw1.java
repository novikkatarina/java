package lesson2;
// Написать программу, показывающую последовательность действий для игры “Ханойская башня”

import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
    Scanner iScanner = new Scanner(System.in);
    System.out.printf("n: ");
    String n1 = iScanner.nextLine();
    iScanner.close();
    int n = Integer.valueOf(n1);
    int start = 1;
    int end = 3;
    hannoiTower(n,start,end);
    }
    public static void hannoiTower(int n, int start, int end){
        int other = 0;
         if (n==1){
            print (start, end);}
         else{
            other = 6 - (start + end);
            hannoiTower(n-1, start, other);
            print (start, end);
            hannoiTower(n-1, other, end);}
    }
    public static void print(int start, int end){
    System.out.println(start + "->" + end);
    }

    
}
