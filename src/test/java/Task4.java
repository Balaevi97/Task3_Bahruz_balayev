import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("შეიყვანეთ დოლარის გაცვლითი კურსი ევროსთან მიმართებაში");
        double exchangeRate = scanner.nextDouble();
        System.out.println("შეიყვანეთ გადსაცვლელი თანხის რაოდენობა");
        double exchangeAmount = scanner.nextDouble();
        System.out.println("შეიყვანეთ მომსახურების საკომისიო");
        double input = scanner.nextDouble();

        //     double exchangeCommission = input / 100;

        double eurReceived = exchangeAmount * exchangeRate * (1 - (input/100));

        System.out.println(eurReceived);

    }
}
