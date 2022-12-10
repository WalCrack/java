package lr3;

import java.util.Scanner;

public class Example4_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 2 числа");

        int one = in.nextInt();
        int two = in.nextInt();
        int min, max;

        if (one < two){
            for (int one_1 = one; one_1 <= two; one_1++){
                System.out.printf("%d, ", one_1);
            }
        }else {
            for (int two_1 = two; two_1 <= one; two_1++){
                System.out.printf("%d, ", two_1);
            }
        }
    }
}
