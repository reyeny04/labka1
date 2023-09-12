import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите коэффициенты квадратного уравнения:");
        System.out.print("Введите a: ");
        double a = scanner.nextDouble();

        System.out.print("Введите b: ");
        double b = scanner.nextDouble();

        System.out.print("Введите c: ");
        double c = scanner.nextDouble();

        scanner.close();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Корень 1: " + root1);
            System.out.println("Корень 2: " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Корень: " + root);
        } else {
            System.out.println("Дискриминант отрицателен. Нет действительных корней.");
        }
    }
}
