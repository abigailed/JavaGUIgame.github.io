package Presentation;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Quiz.*;

public class dialogueFrame extends JFrame {

    int counter = 0;
    double total = 9;
    SetQuizQuestions quiz1 = new SetQuizQuestions();
    CalculateGrade calculator = new CalculateGrade();

    JPanel dialoguePanel = new JPanel();

    JPanel dialoguePanel2 = new JPanel();

    // A JLabel to display the instructions for the quiz
    private JLabel quizInstructions = new JLabel("Welcome to the geography quiz! Press start to start the quiz!!");

    // A JButton to start the quiz
    private JButton startButton = new JButton("START QUIZ");

    // a JLabel to display the current quiz question
    private JLabel currentQuestion = new JLabel(quiz1.getQuestionDescription(counter));


    // A JButton to select yes
    private JButton yesButton = new JButton("YES");

    // A JButton to select no
    private JButton noButton = new JButton("NO");

    // A JLabel to display the users final grade
    private JLabel finalGrade = new JLabel("");

    private JFrame frame1;


    /**
     * dialogue frame constructor
     */
    public dialogueFrame() {

        //if (quiz1.getCorrectAnswer(counter).equals("N")){
           // calculator.ScoreValue();}

        frame1 = this;

        ActionListener yesListener = new dialogueFrame.yesButtonListener();
        yesButton.addActionListener(yesListener);

        ActionListener noListener = new dialogueFrame.noButtonListener();
        noButton.addActionListener(noListener);

        ActionListener startListener = new dialogueFrame.startButtonListener();
        startButton.addActionListener(startListener);

        dialoguePanel2.add(yesButton);
        dialoguePanel2.add(noButton);
        dialoguePanel2.add(currentQuestion);
        dialoguePanel2.add(finalGrade);

        this.dialoguePanel.add(startButton);
        this.dialoguePanel.add(quizInstructions);
        this.setContentPane(this.dialoguePanel);

        this.setSize(500, 500);
        this.setTitle("Geography Quiz");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }


    /**
     * display the current quiz question on the JLabel
     * @return the current question
     */
    public JLabel DisplayCurrentQuestion() {
        return currentQuestion;
    }

    /**
     * Start button action listener
     */
    public class startButtonListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            frame1.getContentPane().removeAll();
            frame1.getContentPane().remove(dialoguePanel);
            frame1.getContentPane().add(dialoguePanel2);

            frame1.setVisible(true);
        }
    }

    /**
     * yes button action listener
     */
    public class yesButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            // while loop to display the quiz questions
            if ((counter<total) & quiz1.getCorrectAnswer(counter).equals("Y")){
                calculator.ScoreValue();}

            if (counter < total) {
                counter++;
                currentQuestion.setText(quiz1.getQuestionDescription(counter));
            } else if (counter >= total) {
                currentQuestion.setText("");
                finalGrade.setText(calculator.calculateFinalGrade());
            }
        }
    }

    /**
     * no button action listener
     */
    public class noButtonListener implements ActionListener {

            public void actionPerformed(ActionEvent e) {

                // while loop to display the quiz questions
                if ((counter<total) & quiz1.getCorrectAnswer(counter).equals("N")){
                    calculator.ScoreValue();}

                if (counter < total) {
                    counter++;
                    currentQuestion.setText(quiz1.getQuestionDescription(counter));
                } else if (counter >= total) {
                    currentQuestion.setText("");
                    finalGrade.setText(calculator.calculateFinalGrade());
                }
            }
        }
}








