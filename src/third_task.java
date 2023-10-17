public class third_task {
    public static void notMagic() {
        int[] C = {5, 1, 8, 3, 9, 4, 2, 7, 6, 10, 15, 12, 11, 14, 13, 20, 19, 18, 17, 16};
        int sum = 0;

        for (int i = 0; i < C.length; i++) {
            sum += C[i];
        }

        double average = (double) sum / C.length;

        System.out.println("Среднее значение: " + average);
    }
}
