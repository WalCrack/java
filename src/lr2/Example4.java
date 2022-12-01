package lr2;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число:");
        int number = in.nextInt();

        if (5 <= number && number <= 10) {
            System.out.println("Ваше число попадает в диапазон от 5 до 10 включительно.");
        } else {
            System.out.println("Ваше число не попадает в диапазон от 5 до 10 включительно.");

        }
    }
}
