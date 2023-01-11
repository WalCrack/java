package lr7.example2;

public class podClass extends superClass {
    private String text2;

    public int int1;

    podClass() {
        setText1();}
    podClass(String text2) {
        setText1(text2);}
    podClass(int int1) {
        setText1(); this.setInt1(int1);}
    podClass(String text2, int int1) {
        setText1(text2); this.setInt1(int1);}

    public void setInt1(int int1) {
        this.int1 = int1;
    }
    public void setText1(){
        this.text2 = "пустая переменная.";
    }

    public void setText1(String str2){
        this.text2 = str2;
    }

    public int getInt1(){
        return int1;
    }

    public String gettext1(){
        return text2;
    }

    public int gettext1length(){
        return text2.length();
    }

    @Override
    public String toString() {
        String nameClass = "\n[работает подкласс] text2 = " + gettext1()  + " Длина = " +gettext1length()
                +" int1 = " + getInt1();
        return nameClass;
    }
}
