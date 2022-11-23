package lr1;
import java.util.Scanner;
public class Example14 {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);

        System.out.println("Введите число:");
        Integer number = in.nextInt();

        Integer number_p, number_m, number_kv;

        number_p = number + 1;
        number_m = number - 1;
        number_kv = (number_m + number_p) * (number_m + number_p);

        System.out.printf("%d %d %d %d", number, number_p, number_m, number_kv);

    }
}
