package lr7.example1;

public class example1 {
    public static void main(String[] args) {
        superClass superClassObject = new superClass("Конструктор суперкласса");
        String className = superClassObject.toString();
        System.out.println(className);

        podClass subClassObject1 = new podClass("Конструктор подкласса");
        String subClassName = subClassObject1.toString();
        System.out.println(subClassName);

        podClass subClassObject2 = new podClass("Конструктор подкласса", "это 2ой параметр");
        String subClassName2 = subClassObject2.toString();
        System.out.println(subClassName2);
    }
}

