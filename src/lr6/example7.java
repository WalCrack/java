package lr6;

public class example7 {
    public static void main(String[] args) {
        char[] array = {'а', 'б', 'в', 'г', 'д'};
        array_symbol example6 = new array_symbol();
        example6.return_array(array);
        System.out.println("Второй аргумент меньше исходного массива");
        example6.print_array();
    }

}
class array_symbol {
    static int [] out_array;
    static int [] return_array(char[] array) {
        out_array = new int[array.length];
        for (int i =0; i < array.length; i++){
            out_array[i] = (int)array[i];
        }

        return out_array;
    }
    static void print_array(){
        for (int i = 0; i < array_symbol.out_array.length; i++) {
            System.out.println("Элемент массива [" +i+ "] - "+out_array[i]+" ("+(char)out_array[i]+");");
        }
    }
}