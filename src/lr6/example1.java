package lr6;

public class example1 {
    public static void main(String[] args) {
        ex1 example1_1 = new ex1();
        example1_1.set('А');
        example1_1.set("Ы");
        char[] ch1 = {'А','б','В','г','Д','е'};
        char[] ch2 = {'Ж'};
        example1_1.set(ch1);
        example1_1.set(ch2);
    }
}
class ex1{
   private char ch;
   private String str;

    void set(char j){
        System.out.print("Ввели символ: ");
        ch = j;
        System.out.println(ch);
    }
    void set(String j){
        System.out.print("Ввели текст: ");
        str = j;
        System.out.println(str);
    }
    void set(char[] j){
        if (j.length == 1){
            ch = j[0];
            System.out.println("Массив с 1им элементом: "+ch);
        }
        else {
            str = new String(j);
            System.out.println("В массиве больше 1го эл-та: "+str);
        }
    }
}