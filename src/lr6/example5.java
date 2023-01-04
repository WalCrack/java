package lr6;

import java.util.Scanner;

public class example5 {
    public static void main(String[] args) {
        System.out.println("Введите число n");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n> 0) {
            int sum = SumKvad_rekurs.sum(n);
            System.out.println("Рекурсивный метод " + sum);

            int kvad = SumKvad.sum(n);
            System.out.println("Не рекурсивный метод " + kvad);
        }
        else {
            System.out.println("некорректно введено число");
        }
    }
}
    class SumKvad_rekurs {
    //рекурсия
     static int sum(int n){
            int result = 0;
            if (n == 1) return 1;
            result += sum(n-1) + n*n;
            return result;
            }
        }
        class SumKvad {
    //не рекурсия
            static int sum(int n){
                int result = 0;
                for (int i = n; i > 0; i--){
                    result += i * i;
                }
                return result;
            }
        }



