public class condition_operator {
    public static void notMagic() {
        double sum = 0;
        for (int i = 1; i <= 10000; i++) {
            if (i % 2 == 0) {
                sum -= 1.0 / i;
            } else {
                sum += 1.0 / i;
            }
        }
        System.out.println("Выражение равно: " + sum);
    }
}
