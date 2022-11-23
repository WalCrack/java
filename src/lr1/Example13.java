package lr1;
import java.util.Scanner;
public class Example13 {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);

        System.out.println("Введите первое число:");
        Integer first_number = in.nextInt();

        System.out.println("Введите второе число:");
        Integer second_number = in.nextInt();

        Integer sum = 0;
        sum = first_number + second_number;

        System.out.printf("%d + %d = %d", first_number, second_number, sum);

    }
}
