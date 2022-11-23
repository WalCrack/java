package lr1;
import java.util.Scanner;
public class Example12 {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);

        int this_year = 2022;

        System.out.println("Введите Ваш возраст:");
        Integer age = in.nextInt();

        this_year = this_year - age;

        System.out.println("Ваш год рождения: " + this_year);

    }
}
