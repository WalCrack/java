package lr7.example3;

public class podPodClass extends podClass{
    podPodClass(int int1) {
        super(int1);
    }
    public String text;
    public void setInt1(int int1, char char1, String text) {
        super.int1 = int1;
        super.char1 = char1;
        this.text = text;
    }
    podPodClass(int int1, char char1, String text) {
        super(int1,char1);
        setInt1(int1, char1, text);
    }
    public String toString() {
        String text3 ="\n Вывод (str) = " + this.gettext();
        return super.toString()+text3;
    }
    public String gettext() {
        return text;
    }
}
