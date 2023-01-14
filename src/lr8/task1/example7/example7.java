package lr8.task1.example7;

import java.io.*;

public class example7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter out = null;
        try {
            //создание файловых символьных потоков для чтения и записи
            br = new BufferedReader(new FileReader("E:\\учеба\\Программирование\\java\\src\\lr8\\task1\\example7\\reed.txt"), 1024);
            out = new BufferedWriter(new FileWriter("E:\\учеба\\Программирование\\java\\src\\lr8\\task1\\example7\\write.txt"));
            int lineCount = 0; //счетчик строк
            String s;
            //переписывание информации из одного файла в другой
            while ((s=br.readLine())!= null){
                lineCount++;
                System.out.println(lineCount + ": " + s);
                out.write(s);
                out.newLine(); //переход на новую строку
            }
        } catch (IOException e) {
            System.out.println("Ошибка!!!!"+e);
        }
        finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}
