package lr4;
import java.util.Random;
import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк");
        int str = in.nextInt();
        System.out.println("Введите количество столбцов");
        int stlb = in.nextInt();
        int array[][] = new int[str][stlb];
        int InvertAarray[][] = new int[stlb][str];
        Random random = new Random();
        //массив начальный
        System.out.println("Массив до переворота");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(9);
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
            System.out.println("Массив после переворота");
            for (int k = 0; k < array.length; k++) {
                for (int j = 0; j < array[k].length; j++) {
                    InvertAarray[j][k] = array[k][j];
                }
            }

            for (int b = 0; b < InvertAarray.length; b++) {
                for (int j = 0; j < InvertAarray[b].length; j++) {
                    System.out.print(InvertAarray[b][j]);
                }
                System.out.println();
            }

        }
    }

