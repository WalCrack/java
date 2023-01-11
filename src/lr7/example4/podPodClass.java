package lr7.example4;

public class podPodClass extends podClass{
    podPodClass(char char1) {
        super(char1);
    }
    public int int1;
    public void setCharStrInt(char char1, String str1, int int1) {
        super.char1 = char1;
        super.str1 = str1;
        this.int1 = int1;
    }
    podPodClass(char char1, String str1, int int1) {
        super(char1,str1);
        setCharStrInt(super.char1, super.str1, int1);
    }
    podPodClass(podPodClass copy) {
        super(copy.char1, copy.str1);
        this.setCharStrInt(copy.char1, copy.str1, copy.int1);
    }
    public String toString() {
        String text3 ="\n str 2 (int1) = " + this.getInt1();
        return super.toString()+text3;
    }
    public int getInt1() {
        return int1;
    }
}
