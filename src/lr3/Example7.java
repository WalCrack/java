package lr3;


import java.util.Collections;
import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        System.out.println("Введите размерность массива");
        int size = in.nextInt();
        char letter = 'a';

        char[] array = new char[size];
        for(int i = 0; i < array.length; i++) {
            array[i] = (char) letter++;
            letter++;
            System.out.print(array[i]);
        }
        System.out.println();
        for (int j = size-1; j >= 0; j--) {
            System.out.print(array[j]);
            }
    }
}

