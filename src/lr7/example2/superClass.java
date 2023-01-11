package lr7.example2;

public class superClass {
    private String text1;

    superClass() {
        setText1();}
    superClass (String text1){
        setText1(text1);}
    public void setText1(){
        this.text1 = "пустая переменная.";
    }
    public void setText1(String text1){
        this.text1 = text1;
    }

    public String gettext1(){
        return text1;
    }
    public int gettext1length(){
        return text1.length();
    }

    @Override
    public String toString() {
        String nameClass = "\n[работает суперкласс] text1 = " + gettext1()  + " Длина = " +gettext1length();
        return nameClass;
    }
}
