package lr7.example5;

public class superClass {
    protected String str1;

    public void setStr1(String str1) {
        this.str1 = str1;
    }
    superClass(String str1){
        this.setStr1(str1);
    }
    public void PrintToString() {
        String ClassName;
        ClassName ="\nИмя класса: " + this.getClass().getSimpleName() + "\n" +"String 1 = \"" + this.getStr1()+"\"";
        System.out.println(ClassName);
    }
    public String getStr1() {
        return str1;
    }
}
