package lr3;

import java.util.Scanner;

public class Example4_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 2 числа");

        int one = in.nextInt();
        int two = in.nextInt();
        int min, max;

        if (one < two){
            while (one <= two){
                System.out.printf("%d, ", one);
                one++;
            }
        }else {
            while (two <= one){
                System.out.printf("%d, ", one);
                two++;
            }
        }
    }
}
