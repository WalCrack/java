package lr8.task1.example6;

import java.io.*;

public class example6 {
    public static void main(String[] args) throws IOException {
        Reader in=null;
        Writer out=null;
        try {
            in = new FileReader("E:\\учеба\\Программирование\\java\\src\\lr8\\task1\\example6\\reed.txt");
            out= new FileWriter("E:\\учеба\\Программирование\\java\\src\\lr8\\task1\\example6\\write.txt", true);
            int oneByte;
            while ((oneByte = in.read()) != -1) {

                out.append((char)oneByte);
                System.out.print((char)oneByte);
            }
        }
        catch (IOException e) { System.out.println("Ошибка!!!! ");
        }
        finally{
            in.close();
            out.close();
        }
    }

}
