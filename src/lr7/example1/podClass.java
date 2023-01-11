package lr7.example1;


public class podClass extends superClass {
    private String text2;
    private String text3;
    podClass(String Pri) {
        super(Pri);
    }
    podClass(String Pri2, String Pri3) {

        this.text2 = Pri2;
        this.text3 = Pri3;
    }
    @Override
    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue = "\nПодкласс" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " Значение 1 = " + this.getText1() + "\n" +
                " Значение 2 = " + this.text2 + "\n" +
                " Значение 3 = " + this.text3;
        return ClassNameAndFieldValue;
    }

    public String getText3() {
        return text3;
    }

    public void setText3(String text3) {
        this.text3 = text3;
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }
}
