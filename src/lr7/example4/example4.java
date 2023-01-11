package lr7.example4;

public class example4 {
    public static void main(String[] args) {

        superClass example4 = new superClass('А');
        String className1 = example4.toString();
        System.out.println(className1);

        //копия
        System.out.print("\nТест копии 1");
        superClass example4_1 = new superClass(example4);
        String className1copy = example4_1.toString();
        System.out.println(className1copy);

        podClass example4_2 = new podClass('A',"вы знали, что год кролика это");
        String className2 = example4_2.toString();
        System.out.println(className2);

        //копия
        System.out.print("\nТест копии 2");
        podClass example4_3 = new podClass(example4_2);
        String className2Copy = example4_3.toString();
        System.out.println(className2Copy);

        podPodClass example4_4 = new podPodClass('A',"вы знали, что год кролика это",2023);
        String className3 = example4_4.toString();
        System.out.println(className3);

        //копия
        System.out.print("\nТест копии 3");
        podPodClass example4_5 = new podPodClass(example4_4);
        String className3Copy = example4_5.toString();
        System.out.println(className3Copy);
    }
}
