import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = in.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = in.nextInt();

        System.out.println("Введите номер операции: ");
        System.out.println("1) Сложение");
        System.out.println("2) Умножение");
        int op = in.nextInt();

        switch(op){
            case 1:
                System.out.print("Результат: " + task1.add(num1, num2));
                break;
            case 2:
                System.out.print("Результат: " + task2.multiplication(num1, num2));
                break;
            default:
                System.out.println("Операции не существует");
        }
    }
}