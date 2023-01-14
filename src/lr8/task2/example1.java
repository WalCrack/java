package lr8.task2;

import java.io.*;

public class example1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter out = null;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream("E:\\учеба\\Программирование\\java\\src\\lr8\\task2\\reed.txt"), "cp1251"));
            out = new PrintWriter("E:\\учеба\\Программирование\\java\\src\\lr8\\task2\\write.txt", "cp1251");
            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null) {
                lineCount++;
                if (lineCount == 2) {
                    out.println(lineCount + ": " + s);
                    System.out.println(lineCount + ": " + s);
                }
                for (int i = 0; i < s.split(" ").length; i++) {
                    if (isNumber(s.split(" ")[i])){
                        double d = Double.parseDouble(s.split(" ")[i]);
                        if (d>=0){
                            out.println(i + ": " + d);
                            System.out.println(i + ": " + d);
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            br.close();
            out.flush();
            out.close();
        }
    }
    public static boolean isNumber(String s) {
        try {
            double i = Double.parseDouble(s);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
