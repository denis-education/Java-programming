public class seventh_task {
    public static void notMagic() {
        String s1 = "Hello";
        String s2 = "World";
        String s3 = "Java";
        String s4 = "Programming";
        String s5 = "Programming";

        String result;
        if (s4.equals(s5)) {
            result = s1 + s2;
        } else {
            result = s1 + s3;
        }

        System.out.println(result);
    }
}
