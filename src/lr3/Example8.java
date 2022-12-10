package lr3;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = 10, b = 0;
        char array[] = new char[size];
        char a = 'A';
        char letters[] = {'A', 'E', 'I', 'O', 'U', 'Y'};
        System.out.print("Содержимое массива: ");
        for (int i = 0; i < array.length; i++){
            if (b < 6){
                array[i] = letters[b];
                b = b + 1;
                System.out.print(array[i]);
            }
            else {
                b = 0;
                array[i] = letters[b];
                b = b + 1;
                System.out.print(array[i]);
            }
        }


    }

}
