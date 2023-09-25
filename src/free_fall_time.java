import java.util.Scanner;

public class free_fall_time {
    public static void calculations(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите высоту: ");
        double h = scanner.nextDouble();

        double g = 9.81;
        double t = Math.sqrt(2 * h / g);

        System.out.println("Время свободного падения: " + t + " секунд");
    }
}
