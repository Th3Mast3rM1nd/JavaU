public class MethodTwo {
    public static void main(String[] args) {
        int highScore = calculateScore(true, 800, 10, 100);
        System.out.println("Your final Score is : " + highScore);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
        }
        return finalScore + 1000;
    }
}
