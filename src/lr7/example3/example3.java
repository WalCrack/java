package lr7.example3;

public class example3 {
    public static void main(String[] args) {
        superClass example1 = new superClass(2023);
        String className1 = example1.toString();
        System.out.println(className1);

        podClass example1_1 = new podClass(2023,'г');
        String className2 = example1_1.toString();
        System.out.println(className2);

        podPodClass example1_2 = new podPodClass(2023,'г',"год кролика");
        String className3 = example1_2.toString();
        System.out.println(className3);
    }
}
