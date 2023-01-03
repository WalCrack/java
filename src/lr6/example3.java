package lr6;

public class example3 {
    public static void main(String[] args) {
        int  i []= {1, 2, 3, 4, 5, 6, 7, 8, 9};
        ex3 example = new ex3();
        example.metodMaxArr(i);
        example.metodMinArr(i);
        example.metodAverageArr(i);
        example.metodMaxArr(4, 1, 7, 5);
        example.metodMinArr(4, 1, 7, 5, -5);
        example.metodAverageArr(4, 1, 7, 5);

    }
}
    class ex3{
        static int max;
        static int min;
        static int average_value;
        static void metodMinArr(int ... arr) {
            min = arr[0];
                for (int i = 0; i < arr.length; i++) {
                min = Math.min(min, arr[i]);
                }
        System.out.println("min: " + min);
    }
    static void metodAverageArr(int ... arr) {
        average_value = 0;
        for (int i = 0; i < arr.length; i++) {
            average_value += arr[i];
        }
         System.out.println("average_value: " + average_value);
    }
    static void metodMaxArr(int ... arr) {
        max = arr[0];
        for (int i = 0; i < arr.length; i++) {
        max = Math.max(max, arr[i]);
        }
           System.out.println("max: " + max);
    }

}