package lr6;

public class example4 {
    public static void main(String[] args) {
        Factorial example = new Factorial();
        int num = 6;
        System.out.println("Рекурсивный метод");
        int fact = example.factorial_1(num);
        System.out.println("Двойной факториал числа: "+num+"!! = "+fact);
        System.out.println("\nМетод без рекурсии");
        int fact2 = example.factorial_2(num);
        System.out.println("Двойной факториал числа: "+num+"!! = "+fact2);
    }
    static class Factorial {
        private int factorial_1(int i) {
            int result;
            System.out.println(i);
            if (i == 1) return 1;
            if (i == 2) return 2;
            result = factorial_1(i - 2) * i;
            return result;
        }

        private int factorial_2(int n) {
            int result = n;
            int j = n;
            for(int i=n; i>2;i=i-2){
                System.out.println(j);
                j=j-2;
                result *= j;
            }
            return result;
        }
    }
}