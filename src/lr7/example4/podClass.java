package lr7.example4;

public class podClass extends superClass{
    podClass(char char1) {
        super(char1);
    }
    public String str1;
    public void setChar1Str1(char char1, String str1) {
        super.char1 = char1;
        this.str1 = str1;
    }
    podClass(char char1, String str1) {
        super(char1);
        this.setChar1Str1(char1, str1);
    }
    podClass(podClass copy) {
        super(copy.char1);
        this.setChar1Str1(copy.char1, copy.str1);
    }
    @Override
    public String toString() {
        String text2 ="\n str 1 = " + this.getStr1();
        return super.toString()+text2;
    }
    public String getStr1() {
        return str1;
    }
}
