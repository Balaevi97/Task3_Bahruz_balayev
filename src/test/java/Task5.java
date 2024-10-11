import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("შეიყვანეთ რიცხვი #1");
        double number1 = scanner.nextDouble();
        System.out.println("შეიყვანეთ რიცხვი #2");
        double number2 = scanner.nextDouble();
        System.out.println("შეიყვანეთ რიცხვი #3");
        double number3 = scanner.nextDouble();
        System.out.println("შეიყვანეთ რიცხვი #4");
        double number4 = scanner.nextDouble();
        System.out.println("შეიყვანეთ რიცხვი #5");
        double number5 = scanner.nextDouble();

        double[] Weight = {2, 3, 4, 5, 6};

        double number1Weight = number1 * Weight[0];
        double number2Weight = number2 * Weight[1];
        double number3Weight = number3 * Weight[2];
        double number4Weight = number4 * Weight[3];
        double number5Weight = number5 * Weight[4];

        double sumNumber = number1Weight + number2Weight + number3Weight + number4Weight + number5Weight;
        double sumWeight = Weight [0] + Weight [1] + Weight [2] + Weight [3] + Weight [4];

        double weightedAverage = sumNumber / sumWeight;

        System.out.println(weightedAverage);
    }

}
