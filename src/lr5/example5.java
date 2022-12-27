package lr5;

public class example5 {
    public static void main(String[] args) {
    ex5 example_1 = new ex5(21);
        System.out.println("i= "+example_1.check());
        System.out.println("\nПроверка пустого значения");
        example_1.set();
        System.out.println("i= "+example_1.check());

        System.out.println("\nПроверка числа больше 0, но меньше 100");
        example_1.set(50);
        System.out.println("i= "+example_1.check());

        System.out.println("\nПроверка числа больше 100");
        example_1.set(101);
        System.out.println("i= "+example_1.check());

        System.out.println("\nПроверка числа меньше 0 ");
        example_1.set(-1);
        System.out.println("i= "+example_1.check());

    }
}
class ex5{
    private int num;

    public void set() {
        num = 0;
    }
    public void set (int i) {
        num = i;
        if (num > 100) {
            this.num = 100;
        }
        if (num < 0){
            num = 0;
        }
    }
    public int check() {
        return num;

    }
    ex5() {
        this.set(num);

    }
    ex5(int i) {
        System.out.println("Проверка конструктора");
        this.set(i);
    }
}
