import java.util.Scanner;

public class StringLengthWithoutLengthMethod {

    public static int findLength(String text) {
        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // Exception occurs when index exceeds string length
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.next();

        int customLength = findLength(text);
        int builtInLength = text.length();

        System.out.println("Length without using length(): " + customLength);
        System.out.println("Length using built-in length(): " + builtInLength);
    }
}
