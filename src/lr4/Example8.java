package lr4;
import java.util.Scanner;
public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст для шифрования");
        String text = in.nextLine();
        System.out.println("Введите ключ для шифрования");
        int key = in.nextInt();
        String encryptString;
        key = key % 33;
        char[] ArrayChar = text.toCharArray();
        int[] ArrayInt = new int[text.length()];
        char[] ArrayCharNew = new char[ArrayChar.length];

        for (int i = 0; i< ArrayChar.length; i++)
        {
            ArrayInt[i] = ArrayChar[i] + key;
            ArrayCharNew[i] = (char)ArrayInt[i];
        }
        encryptString = new String (ArrayCharNew);
        System.out.println("Тест после шифрования: "+ encryptString);
        System.out.println("Выполнить обратное преобразование? (y/n)");

        String choice = in.nextLine();
        if (choice == "y" || choice == "Y") {
            System.out.println(text);
        }
        if (choice == "n" || choice == "N") {
            System.out.println("До свидания!");
        }
        else
            System.out.println("Введите корректный ответ");


        }
    }

