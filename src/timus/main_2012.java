package timus;
import java.io.PrintWriter;
import java.util.Scanner;

public class main_2012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int quantity = in.nextInt();
        if ((12 - quantity) * 45 <= 240){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
