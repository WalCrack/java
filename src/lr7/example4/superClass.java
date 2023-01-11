package lr7.example4;

public class superClass {
    public char char1;

    public void setChar1(char char1) {
        this.char1 = char1;
    }
    superClass(char char1){
        this.setChar1(char1);
    }
    superClass(superClass copy){ this.setChar1(copy.char1); }
    @Override
    public String toString() {
        String ClassName;
        ClassName = "\nИмя класса: " + this.getClass().getSimpleName() + "\n" +" char 1 = " + this.getChar1();
        return ClassName;
    }
    public char getChar1() {
        return char1;
    }
}
