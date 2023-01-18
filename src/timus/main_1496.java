package timus;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class main_1496 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] akk = new String[n];
        in.nextLine();
        for (int i = 0; i < n; i++) {
            akk[i] = in.nextLine();
        }
        Arrays.sort(akk);
        HashSet<String> spam = new HashSet<String>();
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++)
                if(akk[i].equals(akk[j])){
                    spam.add(akk[i]);
                }
        }
        for (String i :spam)
            System.out.println(i);
    }
}
