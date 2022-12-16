package lr4;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите высоту прямоугольного треугольника");
        int height = in.nextInt(); //высота
        for (int i = 0; i < height; i++){
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

