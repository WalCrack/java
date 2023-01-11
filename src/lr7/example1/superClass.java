package lr7.example1;

public class superClass {
    private String text1;
    public superClass(String pri) {
        this.text1 = pri;
    }

    protected superClass() {
        this.text1 = "нет параметров";
    }
    @Override
    public String toString() {
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "\nСуперкласс" + "\n" +
                " Имя класса: " + this.getClass().getSimpleName() + "\n" +
                " Значение 1 = " + this.getText1();
        return superClassNameAndFieldValue;
    }
    public String getText1() {
        return text1;
    }
    public void setText1(String text1) {
        this.text1 = text1;
    }
}
