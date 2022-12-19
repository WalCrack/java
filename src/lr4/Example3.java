package lr4;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк");
        int str = in.nextInt();
        System.out.println("Введите количество столбцов");
        int stlb = in.nextInt();
        int array[][] = new int[str][stlb];

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++) {
                array [i] [j] = 2;
            }
        }
        //Вывод
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}