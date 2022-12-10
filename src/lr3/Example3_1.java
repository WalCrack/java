package lr3;

import java.util.Scanner;

public class Example3_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    int quantity, number, one = 1, two = 1;
        System.out.println("Введите количество чисел в последовательности Фибоначчи, не меньше 3");
        quantity = in.nextInt();
        if (quantity >= 3){
            System.out.print(one + "," + two);
            do {
                number = one + two;
                one = two;
                two = number;
                quantity--;
                System.out.print("," + number);
            } while (quantity - 2 > 0);
        }else {
            System.out.println("Число указано не верно");
        }

    }

}
