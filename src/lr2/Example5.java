package lr2;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            int check1;

            System.out.println("Введите число больше 1000:");
            int number = in.nextInt();

            check1 = number / 1000 % 10;

            if (number < 1000) {
                System.out.println("Вы ввели число меньше 1000");
            } else {
                System.out.println("В введенном числе количество тысяч = "+check1);

            }
    }
}
