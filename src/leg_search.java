import java.util.Scanner;

public class leg_search {
    public static void calculations(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину гипотенузы: ");
        double c = scanner.nextDouble();
        System.out.print("Введите длину катета: ");
        double a = scanner.nextDouble();

        double b = Math.sqrt(c*c - a*a);

        System.out.println("Длина катета: " + b);
    }
}
