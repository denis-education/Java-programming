import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Выберите задачу: ");
        System.out.println("1) Первая задача");
        System.out.println("2) Вторая задача");
        System.out.println("3) Третья задача");
        System.out.println("4) Четветрая задача");
        System.out.println("5) Пятая задача");
        System.out.println("6) Шестая задача");
        System.out.println("7) Седьмая задача");
        int task = in.nextInt();

        switch(task){
            case 1:
                first_task.notMagic();
                break;
            case 2:
                second_task.notMagic();
                break;
            case 3:
                third_task.notMagic();
                break;
            case 4:
                fourth_task.notMagic();
                break;
            case 5:
                fifth_task.notMagic();
                break;
            case 6:
                sixth_task.notMagic();
                break;
            case 7:
                seventh_task.notMagic();
                break;
        }
    }
}