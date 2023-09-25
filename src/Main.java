import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Выберите задачу: ");
        System.out.println("1) Вычислить 2^n");
        System.out.println("2) Факториал числа");
        System.out.println("3) Операции над действительными числами");
        System.out.println("4) Определить время свободного падения");
        System.out.println("5) Нахождение длины катета");
        int task = in.nextInt();

        switch(task){
            case 1:
                exponentiation.calculations();
                break;
            case 2:
                factorial.calculations();
                break;
            case 3:
                operations_with_numbers.calculations();
                break;
            case 4:
                free_fall_time.calculations();
                break;
            case 5:
                leg_search.calculations();
                break;
        }
    }
}