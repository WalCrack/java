package lr6;

public class example8 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Среднее значение для элементов массива = "+array_average.return_array(array));
    }

}
class array_average {
    static double return_array(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        //System.out.println(sum);
        return (double) sum / array.length;
    }
}