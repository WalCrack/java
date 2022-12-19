package lr4;

public class Example5 {
    public static void main(String[] args) {
        int[][] mas = {
                {1, 2, 3 , 4},
                {4, 5, 6, 0},
                {7, 8, 9 , 0}};
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < mas.length / 2; i++) {
            int n = mas.length - 1;
            for (int j = i; j < mas.length - i - 1; j++) {
                int temp = mas[i][j];
                mas[i][j] = mas[j][n - i];
                mas[j][n - i] = mas[n - i][n - j];
                mas[n - i][n - j] = mas[n - j][i];
                mas[n - j][i] = temp;
            }
        }
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j]);
            }
            System.out.println();
        }
    }
}
