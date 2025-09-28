package Presentation;
import java.util.InputMismatchException;
import java.util.Scanner;
import Quiz.*;

public class consoleIO implements IO {

    // declare SetQuizQuestions object
    SetQuizQuestions quiz1;


    // total possible points a user can get
    double total = 10;
    // number of questions the user gets correct
    double score = 0;
    // user answer
    String userAnswer;

    /**
     * creates a new consoleIO object
     */
    public consoleIO() {
        // create SetQuizQuestions object
        quiz1 = new SetQuizQuestions();
    }

    /**
     * displays the quiz questions on the console to the user
     */
    public void displayQuizQuestion() {

        System.out.println("Welcome to the geography quiz! Press 'Y' to answer yes to a question and 'N' to answer no!");

        Scanner sc = new Scanner(System.in);
        // counter for going through question array
        int counter = 0;

        // while loop to display the quiz questions
        while (counter < total) {
            System.out.println(quiz1.getQuestionDescription(counter));
            userAnswer = sc.next();

            if (userAnswer.equalsIgnoreCase(quiz1.getCorrectAnswer(counter)))
                score += 1;
            counter ++;

            if (userAnswer.isEmpty())
                throw new IllegalStateException("Cannot leave answer empty");

            //if (!userAnswer.equalsIgnoreCase("Y") || userAnswer.equalsIgnoreCase("N"))
                //throw new InputMismatchException("Cannot input any other value than 'Y' or 'N'");
        }
        System.out.println("The quiz is complete! Your final grade on the quiz was " + calculateFinalGrade()+ "%");
    }

    /**
     * calculates and returns the final grade of the quiz to the user
     * @return the final grade the user got on the quiz
     */
    public double calculateFinalGrade() {
        double finalGrade;

        finalGrade = (score / total) * 100;
        return finalGrade;
    }

    /**
     * regression testing for consoleIO class
     * @param args
     */
    public static void main (String[]args){
        // test consoleIO() constructor
        consoleIO test1 = new consoleIO();
        if (test1 == null)
            System.out.println("ERROR: consoleIO() constructor not creating consoleIO object correctly");

        // test calculateFinalGrade
        if (test1.calculateFinalGrade() != ((test1.score/ test1.total)*100))
            System.out.println("ERROR: calculateFinalGrade() not returning the correct final grade value");

        // test exceptions
/*
        try {
            test1.userAnswer = "";
            System.out.println("ERROR: displayQuizQuestion() not throwing exception when userAnswer is empty");
        }
        catch(IllegalStateException e)
        {
            //
        }

        try{
            test1.userAnswer = "wrong answer";
            System.out.println("ERROR: displayQuizQuestion() not throwing exception when userAnswer does not equal 'Y' or 'N'");
        }

        catch(InputMismatchException e)
        {

        }
*/
    }


}

