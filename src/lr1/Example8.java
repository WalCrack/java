package lr1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите день недели:");
        String day_week = in.nextLine();

        System.out.println("Введите месяц:");
        String month = in.nextLine();

        System.out.println("Введите дату (число):");
        Integer date = in.nextInt();

        System.out.printf("Сегодня: %s %d %s", day_week, date, month);

    }
}
