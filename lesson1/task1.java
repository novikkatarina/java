// На вход некоторому исполнителю подаётся два числа (a, b). У исполнителя есть две команды
// - команда 1 (к1): увеличить в с раза, а умножается на c
// - команда 2 (к2): увеличить на d, к a прибавляется d
// написать программу, которая выдаёт набор команд, позволяющий число a превратить в число b или сообщить, что это невозможно
// Пример 1: а = 1, b = 7, c = 2, d = 1
// ответ: к2, к2, к2, к2, к2, к2, k2 или к1, к1, к2, к2, к2 
// Можно начать с более простого – просто подсчёта общего количества вариантов 
// Пример 2: а = 11, b = 7, c = 2, d = 1
// ответ: нет решения. 
// *Подумать над тем, как сделать минимальное количество команд

public class task1 {
    public class app {
        public static void main(String[] args) {
            int a = 2;
            int b = 11;
            int c = 2;
            int d = 1;
            int result = a;
            String str = new String();
            if (a >= b)
                System.out.println("нет решения");
            do
                if (result < b && result * c <= b) {
                    result=  result * c;
                    str = str + "K1";
                    if (result == b) {
                        System.out.println(str);
                    }
                } else if (result < b) {
                    result = result + d;
                    str = str + "K2";
                    if (result == b) {
                        System.out.println(str);
                    }
                    if (result > b) {
                        System.out.println("нет решения");
                    }
                }
            while (result < b);
        }
    }
}
