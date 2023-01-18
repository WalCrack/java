package timus;

import java.util.Scanner;

public class main_2100 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            String[] friends = new String[n];
            in.nextLine();
            for(int i = 0;i < n;i++){
                friends[i] = in.nextLine();
            }
            int count_person = 2;
            for(int i = 0;i < n;i++){
                if(friends[i].contains("+one")) {
                    count_person += 2;
                }
                else count_person += 1;
            }
            if(count_person == 13) count_person++;
            System.out.print(count_person*100);
        }
}
