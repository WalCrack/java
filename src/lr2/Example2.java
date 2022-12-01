package lr2;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int check1, check2;

        System.out.println("Введите число:");
        int number = in.nextInt();

        check1 = number % 5;
        check2 = number % 7;

        if (check1 == 2 && check2 == 1) {
            System.out.println("Ваше число удовлетворяет всем критериям");
        } else {
            System.out.println("Ваше число не удовлетворяет всем критериям");

        }
    }
}
