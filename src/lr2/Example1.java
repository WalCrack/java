package lr2;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число:");
        int x = in.nextInt();
        if (x % 3 == 0) {
            System.out.println("Ваше число делиться на 3 (три)");
        } else {
            System.out.println("Ваше число не делиться на 3 (три)");

        }
    }
}
