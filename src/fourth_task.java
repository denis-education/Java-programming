public class fourth_task {
    public static void notMagic() {
        int[] D = {5, 1, 8, 3, 9, 4, 2, 7, 6, 10, 15, 12, 11, 14, 13, 20, 19, 18, 17, 16, 25, 23, 28, 27, 29, 24, 22, 26, 30, 21};
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < D.length; i++) {
            if (D[i] % 2 == 0) {
                sumEven += D[i];
            } else {
                sumOdd += D[i];
            }
        }

    System.out.println("Сумма четных элементов: " + sumEven);
    System.out.println("Сумма нечетных элементов: " + sumOdd);
    }
}
