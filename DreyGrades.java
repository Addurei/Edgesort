import java.util.InputMismatchException;
import java.util.*;
public class DreyGrades {

    public static int validScanner(Scanner sc){
        while(true){
            try{
                return sc.nextInt();
            }catch(InputMismatchException e){
                System.out.println("Invalid input.");
                sc.next();
                System.out.print("Please enter a number: ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---WELCOME TO SIMPLE GRADE CALCULATOR---");

        boolean isRunning = true;

        while(isRunning){
            System.out.println("\n-----1: Min----" +
                                "\n----10: Max----" + 
                                "\nEnter number of students: ");
            int students = validScanner(sc);
            System.out.print("Enter number of grades: ");
            int grades = validScanner(sc);
            if(students == 0){
                System.out.println("Exiting Program...Goodbye");
                isRunning = false;
            }
            if(students < 0 || students > 10){
                System.out.println("Invalid Input!");
            }else{
                for(int i = 1; i <= students; i++){
                    System.out.println("---Student " + i + "---");
                    for(int j = 1; j <= grades; j++){
                        System.out.println("Grade " + j + ": ");
                        int grade = validScanner(sc);
                    }
                }
            }
            isRunning = false;
        }
        sc.close();
    }
}
