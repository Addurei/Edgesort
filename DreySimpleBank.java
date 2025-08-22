import java.util.*;
public class DreySimpleBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 0;
        boolean isRunning = true;

        System.out.println("----WELCOME TO SIMPLE BANK----");
        while(isRunning){
            System.out.println("\nChoose an action:\n" +
                                "1: View balance\n" +
                                "2: Deposit\n" +
                                "3: Withdraw\n" +
                                "4: Exit\n");

            System.out.println("Enter 1 - 4:");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                System.out.println("Your current balance is:\n" +
                                    balance + "!");
                break;

                case 2:
                System.out.println("Please enter the amount you wish to deposit:");
                double deposit = sc.nextDouble();
                System.out.println(deposit + " deposited to your account!");
                balance += deposit;
                break;

                case 3:
                System.out.println("Please enter the amount you wish to withdraw:");
                double withdraw = sc.nextDouble();
                if(withdraw > balance){
                    System.out.println("Insufficient balancw!");
                }else{
                    System.out.println(withdraw + " withdrawn your account!");
                    balance -= withdraw;
                }
                break;

                case 4:
                System.out.println("Exiting program! Thank you!");
                isRunning = false;
                break;
            }
        }
        sc.close();
    }    
}