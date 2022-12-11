package lr3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");

        int size = in.nextInt();

        System.out.println("Размер массива равен: " + size);
        int[] nums = new int[size];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(200);
            System.out.println("Элемент массива [" + i + "] = " + nums[i]);
        }
        int min_array[] = new int[size];
        int min_nums[] = new int[size];
        int min = nums[0];
        for (int i = 0; i < 2; i++) {
            for (int a = 0; a < nums.length; a++) {
                if (min >= nums[a]) {
                    min_array[a] = a;
                    min = nums[a];
                    min_nums[a] = nums[a];
                } else {
                    min_array[a] = 0;
                    min_nums[a] = 0;
                }
            }
        }
        for (int b = 0; b < nums.length; b++) {
            if (min_nums[b] == min && min_array[b] != 0) {
                System.out.println("Элемент массива [" + min_array[b] + "] " + min_nums[b] + " - минимальное значение");
            }
        }
    }
}

