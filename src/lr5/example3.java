package lr5;

import java.util.Scanner;

public class example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Калькулятор двух целочисленных чисел\nВведите первое число");
        int num_1 = in.nextInt();
        System.out.println("Введите второе число");
        int num_2 = in.nextInt();
        ex3 example1 = new ex3();
        ex3 example2 = new ex3(num_1);
        ex3 example3 = new ex3(num_1, num_2);

    }
}
class ex3 {
    private int  number_1, number_2;
    ex3(){
        System.out.println("Коструктор без передачи аргументов");
           }
    ex3(int number_1){
        System.out.println("\nКоструктор c одним аргументом");
        this.number_1 = number_1;
        System.out.println("Произведение "+ number_1 +" и "+number_2 +" = " +multiplication());
    }
    ex3(int number_1, int number_2){
        System.out.println("\nКоструктор c двумя аргументами");
        this.number_1 = number_1;
        this.number_2 = number_2;
        System.out.println("Произведение "+ number_1 +" и "+number_2 +" = " +multiplication());
    }
    int multiplication (){
        return number_1 * number_2;
    }
    }
