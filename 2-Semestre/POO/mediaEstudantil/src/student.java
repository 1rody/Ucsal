public class student {

    private String name;
    private static float scoreFirst;
    private static float scoreSecond;
    private static float scoreTertiary;
    private double finalScore;

    private String status;

    public void setFinalScore(double finalScore) {
        this.finalScore = finalScore;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(float finalScore) {
        this.finalScore = finalScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static float getScoreFirst() {
        return scoreFirst;
    }

    public static void setScoreFirst(float scoreFirst) {
        student.scoreFirst = scoreFirst;
    }

    public static float getScoreSecond() {
        return scoreSecond;
    }

    public static void setScoreSecond(float scoreSecond) {
        student.scoreSecond = scoreSecond;
    }

    public static float getScoreTertiary() {
        return scoreTertiary;
    }

    public static void setScoreTertiary(float scoreTertiary) {
        student.scoreTertiary = scoreTertiary;
    }
    public float calcMedia() {
        finalScore = ((scoreTertiary + scoreSecond + scoreFirst) / 3);

        return (float) finalScore;
    }
    public void Approved() {
        if ( finalScore >= 54 ) {
            status = "Aprovado";
            System.out.println("O estudante foi aprovado");
        }
        else {
            status = "Reprovado";
            System.out.println("O estudante foi aprovado");

        }
    }
}
