import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите перове число: ");
        double number1 = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double number2 = scanner.nextDouble();

        System.out.println("Результат" + number1 * number2);
    }
}
