package lr1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Введите месяц (в предложном падеже):");
        String month = in.nextLine();

        System.out.println("Введите количество дней в этом месяце:");
        Integer date = in.nextInt();

        System.out.printf("В %s количесво дней равно %d ", month, date);

    }
}
