import java.util.Random;
import java.util.Scanner;

public class homework2GuessTheNumber {

    public static void main(String args[]) {

        final int MIN = 1;// setting limits for user entered number between 1 and 100
        final int MAX = 100;
        int count = 1;// that will be our counter of tries

        System.out.println("Please enter number between " + MIN + " and " + MAX);// asking user to enter hes number
        Scanner userNumber = new Scanner(System.in);
        int x = userNumber.nextInt();
        System.out.println("And computer will try to guess it");

        Random r = new Random();
        int a = r.nextInt(100) + 1; //we set range within which PC will search for correct number
        while(x != a){
            System.out.println("The number is " + a + " that was  "+ count +" time we try");
             a = r.nextInt(100)+ 1;
             count++;
        }
        System.out.println("Total times we try to guess was :" +count);
        System.out.println( "We finally guessed it!! it is : " + x);

    }

}





