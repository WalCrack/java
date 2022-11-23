package lr1;
import java.util.Scanner;
public class Example11 {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);

        int this_year = 2022;

        System.out.println("Введите имя:");
        String name = in.nextLine();

        System.out.println("Введите год рождения:");
        Integer year_birth = in.nextInt();

        this_year = this_year - year_birth;

        System.out.printf("Вы: %s. Ваш возраст: %d ", name, this_year);

    }
}
