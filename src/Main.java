import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę: ");
        int a = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Podaj drugą liczbę: ");
        int b = scanner.nextInt();
        scanner.nextLine();

        if (a > b) {
            int sum = a + b;
            System.out.println("Suma liczb: " + sum);
        } else if (a < b) {
            int product = a * b;
            System.out.println("Iloczyn: " + product);
        } else {
            int square = a * b;
            System.out.println("Kwadrat: " + square);
        }

    }
}