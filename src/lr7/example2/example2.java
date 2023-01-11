package lr7.example2;

public class example2 {
    public static void main(String[] args) {
        superClass example2 = new superClass();
        String superClass0 = example2.toString();
        System.out.println(superClass0);

        superClass example2_1 = new superClass("Пример первого теста.");
        String superClass1 = example2_1.toString();
        System.out.println(superClass1);

        superClass example2_2 = new podClass();
        String podClass0 = example2_2.toString();
        System.out.println(podClass0);

        superClass example2_3 = new podClass("Пример второго теста.");
        String podClass1 = example2_3.toString();
        System.out.println(podClass1);

        superClass example2_4 = new podClass(256);
        String podClass2 = example2_4.toString();
        System.out.println(podClass2);

        superClass example2_5 = new podClass("Пример третьего теста.", 256);
        String podClass3 = example2_5.toString();
        System.out.println(podClass3);
    }
}
