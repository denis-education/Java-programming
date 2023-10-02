import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Выберите задачу: ");
        System.out.println("1) Теорема Ферма");
        System.out.println("2) Вычислить выражение");
        int task = in.nextInt();

        switch(task){
            case 1:
                ferm_theorem.notMagic();
                break;
            case 2:
                condition_operator.notMagic();
                break;
        }
    }
}