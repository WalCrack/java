package lr4;
import java.util.Random;
import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк");

        int str = in.nextInt();
        System.out.println("Введите количество столбцов");
        int stlb = in.nextInt();
        int array[][] = new int[str][stlb];
        int InvertAarray[][] = new int[stlb - 1][str - 1];

        Random random = new Random();
        System.out.println("Массив до удаления");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(9);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }


        int random_number_str = random.nextInt(10);
        int random_number_stlb = random.nextInt(10);

    if (str > random_number_str & stlb > random_number_stlb) {
        System.out.printf("Будет удалена %d строка и %d столбец\n", random_number_str, random_number_stlb);
        for (int i = 0, k = 0; i < str; i++) {
            if (i != random_number_str) {

                for (int j = 0, r = 0; j < stlb; j++) {
                    if (j != random_number_stlb) {
                        InvertAarray[k][r] = array[i][j];
                        System.out.print(InvertAarray[k][r] + " ");
                        r++;
                    }
                }
                k++;
                System.out.println();
            }
        }
    }else {
        System.out.printf("Сгенерированные значения для удаления столбцов (%d) и строк (%d) меньше, чем введенный вами массив.\n" +
                "Попробуйте ввести массив больше",random_number_stlb, random_number_str);
    }
    }
}
