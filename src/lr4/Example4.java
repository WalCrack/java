package lr4;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк");
        int str = in.nextInt();
        int k = 1;
        int array [] [] = new int [str] [];
        for (int i = 0; i < array.length; i++){
            array [i] = new int[k];
            k++;
        }
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
