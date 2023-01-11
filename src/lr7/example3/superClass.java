package lr7.example3;

public class superClass {
    public int int1;
    public void setInt1(int int1) {
        this.int1 = int1;
    }
    superClass(int int1){
        this.setInt1(int1);
    }
    public String toString() {
        String className;
        className ="\nИмя класса: " + this.getClass().getSimpleName() + "\n" +" Вывод (int) = " + this.getInt1();
        return className;
    }
    public int getInt1() {
        return int1;
    }
}
