package lr5;

public class example6 {
    public static void main(String[] args) {
        ex6 example6 = new ex6(2,4);
        example6.view();
        ex6 example6_2 = new ex6(1);
        example6_2.view();
        example6.assignment(5, 10);
        example6.view();
        example6.assignment(40);
        example6.view();

    }
}
class ex6{
    private int min;
    private int max;

    public void assignment(int i, int j){
        System.out.println("Метод с 2я аргументами");
        min = Math.min(i, j);
        max = Math.max(i, j);
    }
    public void assignment(int i){
        System.out.println("Метод с 1им аргументом");
        min = Math.min(min, i);
        max = Math.max(max, i);
    }
    void view(){
        System.out.println("Min = "+min+" max = "+max);;
    }
    ex6 (int num_1, int num_2){
        System.out.println("Конструктор с 2я аргументами");
        min = Math.min(num_1, num_2);
        max = Math.max(num_1, num_2);
    }
    ex6(int num) {
        System.out.println("Конструктор с 1им аргументом");
        min = Math.min(num, min);
        max = Math.max(num, max);
    }

}