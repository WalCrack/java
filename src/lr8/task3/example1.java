package lr8.task3;

import java.io.*;

public class example1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter out = null;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream("E:\\учеба\\Программирование\\java\\src\\lr8\\task3\\reed.txt")));
            out = new PrintWriter("E:\\учеба\\Программирование\\java\\src\\lr8\\task3\\write.txt");
            System.out.println("Формирую текстовый файл");
            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null) {
                lineCount++;
                String[] arr = s.split(" ");
                int number_letters = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i].matches("(?ui:[^аеёиоуыэюя]).*")) {
                        out.print(arr[i] + " ");
                        number_letters++;
                    }
                }
                out.println("\n Колличество слов начинающиеся с согласных букв в строке №" + lineCount + ": " + number_letters);
            }
            System.out.println("Файл успешно создан");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            assert br != null;
            br.close();
            assert out != null;
            out.flush();
            out.close();
        }

    }
}
