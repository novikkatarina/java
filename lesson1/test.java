// public class test {
//     public static void main(String[] args) {
//         int[][] arr = new int[3][5];
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 System.out.format("%d", arr[i][j]);
//             }
//             System.out.println();
//         }
//     }
// }

// Строки
// import java.util.Scanner;
// public class test {
//    public static void main(String[] args) {
//        Scanner iScanner = new Scanner(System.in);
//        System.out.printf("name: ");
//        String name = iScanner.nextLine();
//        System.out.printf("Привет, %s!\n", name);
//        iScanner.close();
//    }
// }

// Проверка на соответствие получаемого типа
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int a: ");
        boolean flag = iScanner.hasNextInt();
        System.out.println(flag);
        if (flag) {
            int i = iScanner.nextInt();
            System.out.println(i);
        }
        iScanner.close();
    }
}
// сортировка массива

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