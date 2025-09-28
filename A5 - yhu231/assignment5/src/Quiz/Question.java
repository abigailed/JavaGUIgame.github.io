package Quiz;
public class Question {

    //implementing Question class attributes
    String questionDescription;
    String correctAnswer;

    /**
     * Question object constructor
     * @param questionDescription the quiz question
     * @param correctAnswer the answer to the quiz question
     */
    public Question(String questionDescription, String correctAnswer){
        this.questionDescription = questionDescription;
        this.correctAnswer = correctAnswer;
    }

    /**
     * regression testing for Question class
     * @param args
     */
    public static void main (String[]args) {
        // test Question() constructor
        Question question1 = new Question("question1","Y");
        if (question1 == null)
            System.out.println("ERROR: Question() constructor not creating Question object correctly");

        if (!question1.questionDescription.equals("question1"))
            System.out.println("ERROR: getQuestionDescription() not returning correct string value");

        if (!question1.correctAnswer.equals("Y"))
            System.out.println("ERROR: getCorrectAnswer() not returning correct string value");
    }

}
