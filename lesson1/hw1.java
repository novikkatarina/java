
// Написать программу вычисления n-ого треугольного числа. 
import java.util.Scanner;

public class hw1 {
//     public static int[] buildArray(int[] nums)
//     {
//         // nums = {0, 2, 1, 5, 3, 4}
//         int[] ans = new int[nums.length];
//         for (int i = 0; i < nums.length; i++) {
//             int newIndex = nums[i];
//             ans[i] = nums[newIndex];
//         }

//         // ans = {0, 1, 2, 3, 4, 5}

//         return ans;
//     }

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("n: ");
        String n = iScanner.nextLine();
        // System.out.printf("n = %s\n", n);
        iScanner.close();
        int n1 = Integer.valueOf(n);
        double triangular_number = 0.5 * n1 * (n1 + 1);
        System.out.printf("triangular_number = %s\n", triangular_number);

        // 0.5*n*(n+1)
    }
}
