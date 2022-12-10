package lr3;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Введите размер массива");
        int size = in.nextInt();
        int numbers[];
        int a = 0, b = 2;

        if (0 < size){
            numbers = new int[size];
            for (int i = 0; i < size; i++) {
                numbers[a] = b;
                System.out.println("в массив добавлено значение: " + numbers[a]);
                a++;
                b = b + 5;
            }

}
        else {
            System.out.println("Введен некорректный размер массива");
        }



    }
}
