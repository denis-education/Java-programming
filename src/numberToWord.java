import java.util.Scanner;

public class numberToWord {
    public static void notMagic(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите цифру от 0 до 9: ");
        int num = scanner.nextInt();
        String word;

        switch (num) {
            case 0:
                word = "Ноль";
                break;
            case 1:
                word = "Один";
                break;
            case 2:
                word = "Два";
                break;
            case 3:
                word = "Три";
                break;
            case 4:
                word = "Четыре";
                break;
            case 5:
                word = "Пять";
                break;
            case 6:
                word = "Шесть";
                break;
            case 7:
                word = "Семь";
                break;
            case 8:
                word = "Восемь";
                break;
            case 9:
                word = "Девять";
                break;
            default:
                word = "Ошибка: введено число не из диапазона от 0 до 9";
                break;
        }

        System.out.println("Вы ввели: " + word);
    }
}
