package Quiz;
import java.util.InputMismatchException;
import java.util.Scanner;

import Presentation.*;

public class QuizApplication {

    public static void main(String[] args) {
        IO iostyle;

        Scanner sc = new Scanner(System.in);

        System.out.println("Would you like to take this quiz through the console or user interface?\n" +
                "For console input 'C' and for user interface input 'I'");
        String userChoice = sc.nextLine();
        if (userChoice.equalsIgnoreCase("C"))
        {
            iostyle = new consoleIO();
            iostyle.displayQuizQuestion();
        }
        else if (userChoice.equalsIgnoreCase("I"));
        {
            iostyle = new dialogueIO();
            iostyle.displayQuizQuestion();

        }
        try{
        if (!userChoice.equalsIgnoreCase("I") || (!userChoice.equalsIgnoreCase("C")))
                throw new InputMismatchException("Cannot input any letter other the 'C' or 'I'");

        }
        catch(InputMismatchException e){
            //
        }

    }


}
