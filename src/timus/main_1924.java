package timus;

import java.util.Scanner;

public class main_1924 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n % 4 == 1 || n % 4 == 2) {
            System.out.println("grimy");
        } else {
            System.out.println("black");
        }
    }
}
