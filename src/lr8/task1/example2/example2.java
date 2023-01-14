package lr8.task1.example2;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class example2 {
    //метод для чтения данных из потока по байтам с выводом
    public static void readAllByByte(InputStream in) throws IOException {
        while (true) {
            int oneByte = in.read(); //читает 1 байт
            if (oneByte != -1) { //признак отсутсвия конца файла
                System.out.print((char) oneByte);
            } else {
                System.out.print("\n" + "end");
                break;
            }
        }
    }

    public static void main(String[] args) {
        try {
            //с потоком связан файл
            InputStream inFile = new FileInputStream("E:\\учеба\\Программирование\\java\\src\\lr8\\task1\\example2\\1.txt");
            readAllByByte(inFile);
            System.out.print("\n\n\n");
            inFile.close();

            InputStream inUrl = new URL("https://www.google.ru/").openStream();
            readAllByByte(inUrl);
            System.out.print("\n\n\n");
            inUrl.close();

            InputStream inArr = new ByteArrayInputStream(new byte[]{1,2,4,1,4,7,1});
            readAllByByte(inArr);
            System.out.print("\n\n\n");
            inArr.close();

        } catch (IOException e) {
            System.out.println("Ошибка: " + e);
        }
    }
}
