public class MethodOne {
    public static void main(String[] args) {
        calculateScore(true, 800, 10, 100);
        calculateScore(true, 1000, 5, 200);
    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
