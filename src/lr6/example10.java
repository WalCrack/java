package lr6;

public class example10 {
    public static void main(String[] args) {
    MinMax test = new MinMax();
    test.calculations(1, 2, 3, 4, 5);
    test.conclusionMinMax();
    }
}
class MinMax{
    static int [] MaxMin;
    static int[] calculations(int ... array){
        int max = array[0];
        int min = array[0];
        for (int j : array) {
            max = Math.max(max, j);
            min = Math.min(min, j);
        }
        return MaxMin= new int[]{max, min};
    }
     static void conclusionMinMax() {
        System.out.println("Максимальное значение = " + MaxMin[0]);
        System.out.println("Минимальное значение = " + MaxMin[1]);
    }

}
