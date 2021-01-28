import java.util.Random;
import java.util.Scanner;

public class homework2Quiz {

    public static void main(String[] args) {

        String[] questions = {"Where does the basketball player throw the ball?",
                "How many animal species are there on the planet?",
                "Which country hosted the 1998 Winter Olympics?"}; // defined arrays of questions
        String[] answers = {"basket", "8.7 mil", "Japan"};   // defined arrays of answers
        Random random = new Random ();
        int que = random.nextInt(questions.length); //choosing random question
        System.out.println(questions[que]); //and asking user
        String correctanswer = ""; //here we declare our variable with correct answer
        if(questions[que].equals(questions[0])){ //here is condition if choosen question are 0 element of array questions
            correctanswer = answers[0]; //then variable correctanswer declared even to 0 element of answers array
        }else if (questions[que].equals(questions[1])){ //same thing only with 1st element in array
            correctanswer = answers[1]; //and so on
        }else if (questions[que].equals(questions[2])){
            correctanswer = answers[2];
        }
        System.out.println("You have 3 attempts left.");
        System.out.println("P.s. If at any moment you decide to stop the quiz just type in 'pass'");
        System.out.println("     When answering use common sense and orthography rules.");

        Scanner scan = new Scanner(System.in);
        int count = 2;
        String pass = "pass";
        for (int i = 3; i > 0; i--) {
            String answer = scan.nextLine();
            if (answer.equals(correctanswer)){ //here if answer even to correctanswer, then we print following...
                System.out.println("You're right. Congratulations!");
                break;
            }else if(answer.equals(pass)){ //here if user decide to quit our questions quiz
                System.out.println("You lose. Correct answer is: " + correctanswer);
                break;
            }else {
                System.out.println("Incorrect answer. Try again. " + count + " attempts left");
                count--;

            }
        }
    }
}
