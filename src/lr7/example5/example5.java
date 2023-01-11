package lr7.example5;

public class example5 {
    public static void main(String[] args) {
        superClass example5 = new superClass("Первый пример текста");
        example5.PrintToString();

        podClass example5_1 = new podClass("Второй пример текста этой программы");
        example5_1.PrintToString();

        podPodClass example5_2 = new podPodClass("Третий пример текста", 'Р');
        example5_2.PrintToString();

        superClass example5_3 = new superClass(example5_1.getStr1());
        example5_3.PrintToString();

        superClass example5_4 = new superClass(example5_2.str1);
        example5_4.PrintToString();
    }
}
