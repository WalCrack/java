package lr5;

public class example4 {
    public static void main(String[] args) {
        ex4 example_1 = new ex4(12,'A');
        ex4 example_2 = new ex4(65.1267);
    }
}
class ex4{
    private int num;
    private char ch;
    ex4(int a, char b){
        ch = b;
        num = a;
        int length = (int) (Math.log10(num) + 1);
        double result = (double)ch + (double)num*1/Math.pow(10, length);
        System.out.println("Результат = "+result+"; ch = "+(double)ch+ "; int = "+length);
    }
    ex4(double c){
        char ch = (char)c;
        num = (int)((c -(int)c)*100);
        System.out.println("ch = "+ch+"; int = "+num);
    }
}
