package lr3;

import java.util.Scanner;

public class Example3_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int quantity, number, one = 1, two = 1;
        System.out.println("Введите количество чисел в последовательности Фибоначчи, не меньше 3");
        quantity = in.nextInt();
        System.out.print(one + "," + two);
        while (quantity > 0) {
            number = one + two;
            one = two;
            two = number;
            quantity--;
            System.out.print(","+ number);
        }
    }
}
