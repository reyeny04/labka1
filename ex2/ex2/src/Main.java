import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите оценку: ");
        int num = input.nextInt();

        if (num > 10 || num < 1)
            System.out.print("Оценка не может быть выше 10 и ниже 1");

        switch (num) {
            case 10 -> System.out.print("Ваша оцентка: A");
            case 9 -> System.out.print("Ваша оцентка: A-");
            case 8 -> System.out.print("Ваша оцентка: B");
            case 7 -> System.out.print("Ваша оцентка: B-");
            case 6 -> System.out.print("Ваша оцентка: C");
            case 5 -> System.out.print("Ваша оцентка: C-");
            case 4 -> System.out.print("Ваша оцентка: D");
            case 3 -> System.out.print("Ваша оцентка: D-");
            case 2 -> System.out.print("Ваша оцентка: F");
            case 1 -> System.out.print("Ваша оцентка: F-");
        }
    }
}