package lr7.example1;

public class example1 {
    public static void main(String[] args) {
        superClass example1 = new superClass("Конструктор суперкласса");
        String className = example1.toString();
        System.out.println(className);

        podClass example1_1 = new podClass("Конструктор подкласса");
        String subClassName = example1_1.toString();
        System.out.println(subClassName);

        podClass example1_2 = new podClass("Конструктор подкласса", "это 2ой параметр");
        String subClassName2 = example1_2.toString();
        System.out.println(subClassName2);
    }
}

