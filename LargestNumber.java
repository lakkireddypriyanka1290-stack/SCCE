public class LargestNumber {
    public static void main(String[] args) {
        // Static inputs (hard-coded values)
        int a = 25;
        int b = 78;
        int c = 42;

        if (a >= b && a >= c) {
            System.out.println(a + " is the greatest number.");
        } else if (b >= a && b >= c) {
            System.out.println(b + " is the greatest number.");
        } else {
            System.out.println(c + " is the greatest number.");
        }
    }
}