package lr7.example5;

public class podClass extends superClass {
    protected int int1;

    public void setInt1(int int1) {
        this.int1 = int1;
    }
    podClass(String str1) {
        super(str1);
        int1 = str1.length();
    }

    @Override
    public void PrintToString() {
        String text = "int1 = \"" + this.getInt1()+"\"";
        super.PrintToString();
        System.out.println(text);
    }
    public int getInt1() {
        return int1;
    }
}
