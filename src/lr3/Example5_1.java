package lr3;

import java.util.Scanner;

public class Example5_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество чисел в сумме: ");
        int number = in.nextInt(), c = 0, sum = 0;
        for (int a = 1; a <= number; ++c){
            if(c % 5 == 2 || c % 3 == 1){
                if (a == number) System.out.print(c);
                else {
                    System.out.print(c + " + ");
                }
                sum += c;
                ++a;
            }
        }
        System.out.print(" = " + sum);
        in.close();
    }
}