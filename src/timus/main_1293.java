package timus;

import java.util.Scanner;

public class main_1293 {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);

        System.out.println("Введите количество прямоугольных панелей:");
        Integer quantity  = in.nextInt();

        System.out.println("Введите размер A:");
        Integer size_a = in.nextInt();

        System.out.println("Введите размер B:");
        Integer size_b = in.nextInt();


        System.out.printf("На обработку всех прямоугольных панелей требуется %d нанограмм(а) сульфида",((size_a * size_b) * 2) * 5 );
    }
}
