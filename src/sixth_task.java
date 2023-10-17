import java.util.Arrays;
import java.util.Random;

public class sixth_task {
    public static void notMagic() {
        int n = 25;
        int[] A = new int[n];

        Random random = new Random();
        for (int i = 0; i < n; i++) {
            A[i] = random.nextInt(100);
        }

        System.out.println("Исходный массив: " + Arrays.toString(A));

        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < n; i++) {
            if (A[i] < A[minIndex]) {
                minIndex = i;
            }
            if (A[i] > A[maxIndex]) {
                maxIndex = i;
            }
        }

        int temp = A[minIndex];
        A[minIndex] = A[maxIndex];
        A[maxIndex] = temp;

        System.out.println("Измененный массив: " + Arrays.toString(A));
        System.out.println("Максимальный элемент: " + maxX(A));
    }

    public static int maxX(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
