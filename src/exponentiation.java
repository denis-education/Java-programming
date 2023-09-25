import java.util.Scanner;

public class exponentiation {
    public static void calculations(){
        Scanner in = new Scanner(System.in);

        System.out.print("Введите степень: ");
        int n = in.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= 2;
        }

        System.out.println("Результат: " + result);
    }
}
