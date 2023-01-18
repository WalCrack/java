package timus;

import java.util.Scanner;

public class main_1110 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int y = in.nextInt();
        int test=1;
        boolean x = false;
        for (int i = 0; i < m; i++) {
            test=1;
            for (int j = 0; j < n; j++) {
                test = (test*(i%m))%m;
            }
            if (test == y) {
                System.out.print(i + " ");
                x = true;
            }
        }
        if (x == false)
            System.out.print("-1");
    }
}
