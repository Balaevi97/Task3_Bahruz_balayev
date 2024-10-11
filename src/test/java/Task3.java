import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("შეოყვანე რიცხვი #1");
        int numberOne;
        while (true){
            if (scanner.hasNextInt()) {
                numberOne = scanner.nextInt();
                if (numberOne > 0) {
                    break;
                } else {
                    System.out.println("გთხოვთ შეიყვანოთ 0-ზე მეტი მნიშვნელობა");
                }
            } else {
                System.out.println("გთხოვთ შეიყვანოთ მთელი რიცხვი");
                scanner.next();
            }
        }

        System.out.println("შეოყვანე რიცხვი #2");
        int numberTwo;
        while (true){
            if (scanner.hasNextInt()) {
                numberTwo = scanner.nextInt();

                if (numberTwo > 0) {
                    break;
                } else {
                    System.out.println("გთხოვთ შეიყვანოთ 0-ზე მეტი მნიშვნელობა");
                }
            } else {
                System.out.println("გთხოვთ შეიყვანოთ მთელი რიცხვი");
                scanner.next();
            }
        }

        int jami = numberOne + numberTwo;
        System.out.println("თქვენი არითმეთიკული მოქმედების პასუხია " + jami);
        int sxvaoba = numberOne - numberTwo;
        System.out.println("თქვენი არითმეთიკული მოქმედების პასუხია " + sxvaoba);
        int gamravleba = numberOne * numberTwo;
        System.out.println("თქვენი არითმეთიკული მოქმედების პასუხია " + gamravleba);
        int gayofa = numberOne / numberTwo;
        System.out.println("თქვენი არითმეთიკული მოქმედების პასუხია " + gayofa);
        int nashtitGayofa = numberOne % numberTwo;
        System.out.println("თქვენი არითმეთიკული მოქმედების პასუხია " + nashtitGayofa);

    }

}
