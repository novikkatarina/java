
// Написать программу вычисления n-ого треугольного числа. 
import java.util.Scanner;

public class hw1 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("n: ");
        String n = iScanner.nextLine();
        iScanner.close();
        int n1 = Integer.valueOf(n);
        double triangular_number = 0.5 * n1 * (n1 + 1);
        System.out.printf("triangular_number = %s\n", triangular_number);
    }
}
