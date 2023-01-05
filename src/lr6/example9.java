package lr6;

import java.util.Arrays;

public class example9 {
    public static void main(String[] args) {
        char[] array = {'а', 'б', 'в', 'г', 'д',};
        System.out.println("Исходный массив: "+ Arrays.toString(array) +"\nИзменённый массив: "+ Arrays.toString(swap.swap_letters(array)));
    }
}
class swap {
    static char[] swap_letters(char[] array){
        char[] invert_char = new char[array.length];
        int temp =array.length;
        for (int i = 0; i < array.length; i++){
            invert_char[i] = array[temp-1];
            invert_char[temp-1] = array[i];
            temp--;
        }
        return invert_char;
    }
}