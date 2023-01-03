package lr6;

public class example2 {
    public static void main(String[] args) {
    ex2 example2 = new ex2();
    for(int i = 0; i < 10; i++) {
        example2.metod();
    }
    }
}
class  ex2{
    private static int num=0;
    static void metod(){
        System.out.println("Количество просмотров: "+num);
        num++;
    }
}