import java.util.Scanner;

public class factorial {
    public static void calculations(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();

        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("Факториал " + n + " равен " + factorial);
    }
}
