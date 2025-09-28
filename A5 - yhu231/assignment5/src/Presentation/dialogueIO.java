package Presentation;
import Quiz.*;

public class dialogueIO implements IO{

    // declare dialogueFrame object
    dialogueFrame dialogueFrame1;

    /**
     * creates a new dialogueIO object
     */
    public dialogueIO() {

        //create dialogueFrame
        dialogueFrame1 = new dialogueFrame();
    }

    /**
     * displays the quiz questions on the console to the user
     */
    public void displayQuizQuestion() {
        dialogueFrame1.DisplayCurrentQuestion();
    }

    // testing dialogueIO class
    public static void main(String[] args){

        // test dialogueIO() constructor
        dialogueIO test1 = new dialogueIO();

        if (test1 == null)
            System.out.println("ERROR: dialogueIO() constructor not creating consoleIO object correctly");
    }
}





