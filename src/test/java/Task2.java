import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("შეიყვანეთ კონუსის რადიუსი");
        double r = scanner.nextDouble();

        System.out.println("შეიყვანეთ კონუსის სიმაღლე");
        double h = scanner.nextDouble();

        System.out.println("შეიყვანეთ კონუსის გვერდითი ზედაპირი");
        double s = scanner.nextDouble();

        scanner.close();
        //
        double surfaceArea = Math.PI* r * (r + s);
        System.out.println("კონუსის ზედაპირის ფართობია:" + surfaceArea);
        double volume = (1.0/3.0) * Math.PI * Math.pow(r, 2) * h;
        System.out.println("კონუსის მოცულობაა:" + volume);
    }

}
