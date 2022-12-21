package lr4;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Example7 {
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк");

        int str = in.nextInt();
        System.out.println("Введите количество столбцов");
        int stlb = in.nextInt();
        int array[][] = new int[str][stlb];
        int l = 0;
        System.out.println("Начинаю запись в массив");
        for (int j = 0; j < str; j++) {
            if (l < str) {
                for (int i = 0; i < array[0].length; i++) {
                    array[l][i] = random.nextInt(8) + 1;
                    System.out.print(array[0][i] + " ");
                    TimeUnit.MILLISECONDS.sleep(300);

                }

            l++;
            System.out.println();
                        }
            if (l < str) {
                for (int ts = stlb; ts > 0; --ts) {
                    array[l][ts - 1] = random.nextInt(9);
                    System.out.print(array[1][ts - 1] + " ");
                    TimeUnit.MILLISECONDS.sleep(300);

                }

            l++;
            System.out.println();
        }
        }
        System.out.println("Массив после записи");
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}