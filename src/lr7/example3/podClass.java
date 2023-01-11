package lr7.example3;

public class podClass extends superClass{
    podClass(int int1) {
        super(int1);
    }
    public char char1;
    public void setIntStr(int int1, char char1) {
        super.int1 = int1;
        this.char1 = char1;
    }
    podClass(int int1, char char1) {
        super(int1);
        this.setIntStr(int1, char1);
    }
    public char getChar1() {
        return char1;
    }
    public String toString() {
        String text2 ="\n Вывод (char) = " + this.getChar1();
        return super.toString()+text2;
    }
}
