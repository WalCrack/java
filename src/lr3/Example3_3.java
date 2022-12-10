package lr3;

import java.util.Scanner;

public class Example3_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int quantity, number, one = 1, two = 1;
        System.out.println("Введите количество чисел в последовательности Фибоначчи, не меньше 3");
        quantity = in.nextInt();
        if (quantity > 3) {
            System.out.print(one + "," + two);
            for (; (quantity -2 > 0); quantity--) {
                number = one + two;
                one = two;
                two = number;
                System.out.print("," + number);
            }

        }else {
            System.out.println("Число указано не верно");
        }
    }
}
