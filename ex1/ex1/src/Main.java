import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = input.nextLine();

        System.out.println("\n" + "+" + name.replaceAll("[a-zA-Zа-яА-Я]", "-") + "+");
        System.out.println("|" + name + "|");
        System.out.println("+" + name.replaceAll("[a-zA-Zа-яА-Я]", "-") + "+");
    }
}