public class ferm_theorem {
    public static void notMagic(){
        int a, b, c;
        boolean hasSolution = false;
        for (a = 1; a <= 100; a++) {
            for (b = 1; b <= 100; b++) {
                c = (int) Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
                if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
                    System.out.println("Решение найдено для n=2: " + a + "^2 + " + b + "^2 = " + c + "^2");
                    hasSolution = true;
                }
            }
        }
        if (!hasSolution) {
            System.out.println("Для выражения a^2 + b^2 = c^2 (теорема Пифагора) нет натуральных решений от 1 до 100.");
        }
    }
}
