import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-----CALCULATOR-----");
        while(true){
            try{
                 System.out.print("Enter first number: ");
                 int num1 = sc.nextInt();
                 System.out.print("Enter second number: ");
                 int num2 = sc.nextInt();

                 System.out.println("\n---- Choose operation (1-5) ----");
                 System.out.println("\n1: Addition" + 
                                    "\n2: Substraction" + 
                                    "\n3: Multiplication" +
                                    "\n4: Division" +
                                    "\n5: Exit");
                int operation = sc.nextInt();
                switch(operation){
                    case 1:
                    int sum = num1 + num2;
                    System.out.println("\nResult: " + num1 + " + " + num2 + " = " + sum);
                    break;

                    case 2:
                    int difference = num1 - num2;
                    System.out.println("\nResult: " + num1 + " - " + num2 + " = " + difference);
                    break;

                    case 3:
                    int product = num1 * num2;
                    System.out.println("\nResult: " + num1 + " x " + num2 + " = " + product);
                    break;

                    case 4:
                    if(num2 == 0){
                        System.out.println("Cannot divide by 0!");
                    }else{
                        int quotient = num1 / num2;
                        System.out.println("\nResult: " + num1 + " + " + num2 + " = " + quotient);
                        break;
                    }

                    case 5:
                    System.out.println("Exiting program...goodbye!");
                    return;        
                }
            }catch(InputMismatchException e){
                System.out.println("Invalid input!");
                sc.next();
            }

            sc.nextLine();
            System.out.println("Continue using the calculator? Yes/No");
            String response = sc.nextLine();
            if(response.equals("No")){
                System.out.println("Exiting program...goodbye!");
                break;
            }
        }
        sc.close();
    }
}