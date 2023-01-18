package timus;

import java.util.Scanner;

public class main_1787 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int int1 = in.nextInt();
        int int2 = in.nextInt();
        int levo = 0;
        for (int i = 0; i < int2; i++){
            int x = in.nextInt();
            levo = levo + x - int1;
            if (levo<0){
                levo = 0;
            }

        }
        System.out.println(levo);
    }
}
