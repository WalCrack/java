package lr2;

import java.io.PrintWriter;
import java.util.Scanner;

public class timus_1409 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();

        out.println(((a + b - 1) - a)+" "+((a + b - 1) - b));
        out.flush();
    }
}
