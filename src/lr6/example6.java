package lr6;

import java.util.Arrays;

public class example6 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int length_array = 3;
        array example6 = new array();
        example6.return_array(array, length_array);
        System.out.println("Второй аргумент меньше исходного массива");
        example6.print_array();
        length_array = 9;
        System.out.println("Второй аргумент больше исходного массива");
        example6.return_array(array, length_array);
        example6.print_array();

    }

}
class array {
     static int [] out_array;
     int [] return_array(int[] array, int length_array) {

         out_array = new int[length_array];

         if (length_array < array.length) {
             System.arraycopy(array, 0, out_array, 0, out_array.length);
         } else {
             out_array = new int[length_array];
             System.arraycopy(array, 0, out_array, 0, array.length);
         }

         return out_array;
    }
     static void print_array(){
         for (int i = 0; i < array.out_array.length; i++) {
             System.out.println("Элемент массива [" +i+ "] - "+out_array[i]);
         }
    }
}