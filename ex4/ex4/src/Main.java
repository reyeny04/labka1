import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите слово: ");
        String input = scanner.nextLine().toLowerCase();
        scanner.close();

        if (isPalindrome(input)) {
            System.out.println("Слово является палиндромом.");
        } else {
            System.out.println("Слово не является палиндромом.");
        }
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
