import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int accNo = sc.nextInt();
        double initBal = sc.nextDouble();
        double deposit = sc.nextDouble();
        double withdraw = sc.nextDouble();

        if (accNo <= 0 || initBal < 0 || deposit < 0 || withdraw < 0) {
            System.out.println("Invalid Input values.");
        } else {
            double balance = initBal + deposit; 

            if (withdraw > balance) {
                System.out.println("Insufficient balance");
            } else {
                balance = balance - withdraw;
                System.out.println(balance);
            }
        }
        sc.close();
    }
}
