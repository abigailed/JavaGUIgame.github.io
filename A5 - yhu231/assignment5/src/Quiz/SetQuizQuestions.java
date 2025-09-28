package Quiz;

public class SetQuizQuestions {
        // declaring array of type Question named quizQuestions
        Question[] quizQuestions;

    /**
     * creates the quiz questions and puts them in an array
      */
    public SetQuizQuestions() {
        // creating an array of type Question will a size of 10 named quizQuestions
        quizQuestions = new Question[11];

        Question question1 = new Question("Is London the capital of France?", "N");
        Question question2 = new Question("Is Mount Everest located in Nepal?", "Y");
        Question question3 = new Question("Is San Quan the capital of Puerto Rico?", "Y");
        Question question4 = new Question("Is the USA the largest country by land mass?", "N");
        Question question5 = new Question("Is NYC the capital of the USA?", "N");
        Question question6 = new Question("Is Tokyo the capital of Japan?", "Y");
        Question question7 = new Question("Is Australia south of the equator?", "Y");
        Question question8 = new Question("Is Toronto the capital of Canada?", "N");
        Question question9 = new Question("Is Columbia the largest land mass in South America?", "N");
        Question question10 = new Question("Is Rio de Janeiro the capital of Ghana?", "N");

        // adding questions to the array
        quizQuestions[0] = question1;
        quizQuestions[1] = question2;
        quizQuestions[2] = question3;
        quizQuestions[3] = question4;
        quizQuestions[4] = question5;
        quizQuestions[5] = question6;
        quizQuestions[6] = question7;
        quizQuestions[7] = question8;
        quizQuestions[8] = question9;
        quizQuestions[9] = question10;

    }

    /**
     * gets the question description
     * @param index the index of the question we want to display from the array
     * @return the question description
     */
    public String getQuestionDescription(int index){
        if (quizQuestions[index].questionDescription.isEmpty()){
            throw new IllegalStateException("Cannot get from an empty string");}
        if (index > 9){
            throw new ArrayIndexOutOfBoundsException("index value for array is out of bounds");}
        return quizQuestions[index].questionDescription;
    }

    /**
     * gets the question's correct answer
     * @param index the index of the question we want to display from the array
     * @return the correct answer to the question
     */
    public String getCorrectAnswer(int index){
        if (quizQuestions[index].correctAnswer.isEmpty()){
            throw new IllegalStateException("Cannot get from an empty string");}
        if (index > 9){
            throw new ArrayIndexOutOfBoundsException("index value for array is out of bounds");}
        return quizQuestions[index].correctAnswer;
    }


    /**
     * regression testing for SetQuizQuestions class
     * @param args
     */
    public static void main (String[]args) {

        // test SetQuizQuestion constructor
        SetQuizQuestions quiz1 = new SetQuizQuestions();
        if (quiz1 == null)
            System.out.println("ERROR: getQuizQuestions() not creating quiz object correctly");

        // test getQuizQuestionDescription()
        if (!quiz1.getQuestionDescription(0).equals("Is London the capital of France?"))
            System.out.println("ERROR: getQuizQuestions() not returning correct question description");

        if (!quiz1.getQuestionDescription(7).equals("Is Australia south of the equator?"))
            System.out.println("ERROR: getQuizQuestions() not returning correct question description");

        // test getCorrectAnswer()
        if (!quiz1.getCorrectAnswer(0).equals("N"))
            System.out.println("ERROR: getCorrectQuestion() not returning correct quiz question answer");

        if (!quiz1.getCorrectAnswer(7).equals("Y"))
            System.out.println("ERROR: getCorrectQuestion() not returning correct quiz question answer");

        // test exceptions
        Question question11test = new Question("","");
        quiz1.quizQuestions[11] = question11test;

        try {
            quiz1.getQuestionDescription(11);
            System.out.println("ERROR: getQuestionDescription() not throwing exception when question description is empty");
        }
        catch  (IllegalStateException e)
        {
            //
        }

        try{
            quiz1.getCorrectAnswer(11);
            System.out.println("ERROR: getCorrectAnswer() not throwing exception when correct answer is empty");

        }
        catch (IllegalStateException e)
        {
            //
        }

        try{
            quiz1.getQuestionDescription(20);
            System.out.println("ERROR: getQuestionDescription() not throwing exception when index is out of bounds");

        }

        catch (ArrayIndexOutOfBoundsException e)
        {
            //
        }

        try{
            quiz1.getCorrectAnswer(20);
            System.out.println("ERROR: getCorrectAnswer() not throwing exception when index is out of bounds");
        }

        catch (ArrayIndexOutOfBoundsException e)
        {
            //
        }
    }
}

