package Quiz;
public class CalculateGrade {

    // total possible points a user can get
    double total;
    // number of questions the user gets correct
    double score;

    /**
     * Creates calculate grade object
     */
    public CalculateGrade(){
        total = 9;
        score = 0;
    }

    /**
     * Increases the scores value by one each time it's called
     */
    public void ScoreValue(){
        score += 1;
    }

    /**
     * calculates and returns the final grade of the quiz to the user
     * @return quiz final grade
     */
    public String calculateFinalGrade() {
        double finalGrade;

        finalGrade = (score/ total) * 100;

        finalGrade = Math.round(Math.round(finalGrade));

        String grade = String.valueOf(finalGrade);

        return "The quiz is complete! Your final grade on the quiz is " + grade + "%";
        // frame output

    }
    // testing CalculateGrade class
    public static void main(String[] args) {

        // test CalculateGrade() constructor
        CalculateGrade calculator1 = new CalculateGrade();
        if (calculator1 == null)
            System.out.println("ERROR: CalculateGrade() constructor not creating consoleIO object correctly");

        // test scoreValue??

        // test calculateFinalGrade
        double doublegrade = Double.parseDouble(calculator1.calculateFinalGrade());
        if (doublegrade != (calculator1.score/ calculator1.total)*100)
            System.out.println("ERROR: calculateFinalGrade() not returning the correct final grade value");


    }

}


