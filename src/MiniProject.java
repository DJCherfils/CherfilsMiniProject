import java.util.Scanner;
public class MiniProject {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your total bill: ");
        double totalBill = scan.nextDouble();

        System.out.println("Enter your tip percentage: ");
        int tipPercentage = scan.nextInt();

        System.out.println("Enter the total amount of people: ");
        int totalPeople = scan.nextInt();

        double totalTip = (totalBill / 100) * tipPercentage;
        System.out.println("Your total tip is " );
        System.out.printf("%.2f", totalTip);

        double totalBillandTip = totalBill + totalTip;
        System.out.println("Your total bill and tip is " );
        System.out.printf("%.2f", totalBillandTip);

        int tipPerPerson  = (int)(totalTip/totalPeople);
        System.out.println("Your tip per person is " );
        System.out.print(tipPerPerson);
    }

}
