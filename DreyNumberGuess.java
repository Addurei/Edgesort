import java.util.Scanner;
import java.util.Random;
public class DreyNumberGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System .in);
        Random r = new Random();

        int number = r.nextInt(10) + 1;
        int turns = 1;
        boolean isGuessed = false;

        System.out.println("---NUMBER GUESSING GAME---\n");
        while(!isGuessed){
            for(int i = 1; i <= turns; i++){
            System.out.println("Turn " + turns);
            System.out.print("Guess a number from 1 - 10: ");
            int guess = sc.nextInt();
                if(guess > 10 || guess < 1){
                    System.out.println("Guess a number only from 1 - 10! ");
                    turns += 1;
                }else if(guess == number){
                    System.out.println("CORRECT! You guessed the number " + number + 
                                        " in " + turns + " turns!");
                    isGuessed = true;
                    break;
                }else{
                    System.out.println("INCORRECT! " + "Try again!");
                    turns += 1;
                } 
            }
        }
        sc.close();
    }
}
