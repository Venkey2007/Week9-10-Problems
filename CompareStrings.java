import java.util.Scanner;

public class CompareStrings {

    public static boolean compareUsingCharAt(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First String: ");
        String str1 = scanner.next();

        System.out.print("Enter Second String: ");
        String str2 = scanner.next();

        boolean customResult = compareUsingCharAt(str1, str2);
        boolean builtInResult = str1.equals(str2);

        System.out.println("Using charAt(): " + customResult);
        System.out.println("Using equals(): " + builtInResult);

        if (customResult == builtInResult) {
            System.out.println("Both Results Match.");
        } else {
            System.out.println("Results Do Not Match.");
        }
    }
}