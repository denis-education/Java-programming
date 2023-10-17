import java.util.Arrays;

 class second_task {
    public static void notMagic() {
        int[] B = {5, 1, 8, 3, 9, 4, 2, 7, 6, 10, 15, 12, 11, 14, 13, 20, 19, 18, 17, 16, 25, 24, 23, 22, 21};

        for (int i = 0; i < B.length - 1; i++) {
            for (int j = 0; j < B.length - i - 1; j++) {
                if (B[j] > B[j+1]) {
                    int temp = B[j];
                    B[j] = B[j+1];
                    B[j+1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(B));
    }
}
