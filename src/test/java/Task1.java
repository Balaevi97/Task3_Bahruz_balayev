import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("შეიყვანეთ a-ს მნიშვნელობა");
        double a = scanner.nextDouble();
        do {
            if (a == 0) {
                System.out.println("გთხოვთ შეიყვანოთ 0-ზე მეტი მნიშვნელობა");
                a = scanner.nextDouble();
            }
        } while (a == 0);

        System.out.println("შეიყვანეთ b-ს მნიშვნელობა");
        double b = scanner.nextDouble();
        do {
            if (b == 0) {
                System.out.println("გთხოვთ შეიყვანოთ 0-ზე მეტი მნიშვნელობა");
                b = scanner.nextDouble();
            }
        } while (b == 0);

        System.out.println("შეიყვანეთ c-ს მნიშვნელობა");
        double c = scanner.nextDouble();
        do {
            if (c < 0) {
                System.out.println("გთხოვთ შეიყვანოთ 0 ან დადებითი მნიშვნელობა");
                c = scanner.nextDouble();
            }
        } while (c < 0);
        scanner.close();

        double x = (Math.pow(a, 3) + Math.pow(b, 2) - Math.sqrt(c)) / (a * b + c);
        System.out.println(x);

    }

}
