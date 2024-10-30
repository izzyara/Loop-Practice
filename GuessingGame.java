import java.util.*;
public class GuessingGame {
    
    public static void main (String[]args){


        int counter = 1;
        int random = (int)(Math.random()*100);
        Scanner input = new Scanner(System.in);
        System.out.print("Guess a number from 0-100: ");
        int guess = input.nextInt(); 
        while (guess!=random){
            if (guess<random){
                System.out.println("Too low");
            }
            if (guess>random){
                System.out.println("Too high");
            }
            counter++;
            System.out.print("Guess another number: ");
            guess = input.nextInt();
        }
        System.out.println("You gyat it! Guesses: " + counter);

        input.close();
    }
}
