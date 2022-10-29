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
