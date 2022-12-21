package lr4;
import java.util.Scanner;
public class Example9 {
    public static void main(String[] args) {
         char letters[] = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с',
                'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};
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

        for (int i = 0; i< ArrayChar.length; i++) {
            for (int j = 0; j < letters.length; j++) {
                if (ArrayChar[i] == letters[j]) {
                    ArrayCharNew[i] = letters[(j + key) % 33];
                }
            }
        }
        encryptString = new String (ArrayCharNew);
        System.out.println("Тест после шифрования: "+ encryptString);

        System.out.println("Выполнить обратное преобразование? (y/n)");
        boolean check = false;
        while (!check){
            String choice = in.next();
            switch (choice){
                case "y" :
                case "Y" :
                    for (int i = 0; i < ArrayChar.length; i++) {
                        for (int j = 0; j < letters.length; j++) {
                            if (ArrayCharNew[i] == letters[j]) {
                                ArrayChar[i] = letters[(j + 39 - key) % 39];
                            }
                        }
                    }
                    String charToString = new String(ArrayChar);
                    System.out.println(charToString);
                    check = true;
                    break;
                case "n" :
                case "N" :
                    System.out.println("До свидания!");
                    check = true;
                    break;
                default:
                    System.out.println("Введите корректный ответ");
                    check = false;
            }

        }

    }
}

