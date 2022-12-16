package lr4;

public class Example1 {
    public static void main(String[] args) {
        int width; //ширина
        int height; //высота
        int width_v = 0;
        for (height = 0;height < 11; height++){
            for (width = 1; width < 23; width++){
                System.out.print("*");
                width_v = width +1;
            }
            System.out.println("*");
        }
        System.out.printf("Высота прямоугольника: %d, ширина прямоугольника: %d", height, width_v);
    }
}
