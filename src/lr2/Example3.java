package lr2;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int check1;

        System.out.println("Введите число:");
        int number = in.nextInt();

        check1 = number % 4;

        if (check1 == 0 && number > 10) {
            System.out.println("Ваше число удовлетворяет всем критериям");
        } else {
            System.out.println("Ваше число не удовлетворяет всем критериям");

        }
    }
}
