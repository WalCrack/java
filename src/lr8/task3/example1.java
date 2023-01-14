package lr8.task3;

import java.io.*;

public class example1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter out = null;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream("E:\\учеба\\Программирование\\java\\src\\lr8\\task3\\reed.txt")));
            out = new PrintWriter("E:\\учеба\\Программирование\\java\\src\\lr8\\task3\\write.txt");
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
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}
