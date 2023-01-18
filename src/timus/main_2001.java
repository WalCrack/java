package timus;

import java.util.Scanner;

public class main_2001 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int a1 = in.nextInt();
        int b1 = in.nextInt();
        int a2 = in.nextInt();
        int b2 = in.nextInt();
        int a3 = in.nextInt();
        int b3 = in.nextInt();
        int berry_2 = b1 - b2;
        int berry_1 = b3 - berry_2 - b2;
        System.out.println(b1 - b2 + " " + berry_2);
    }
}
