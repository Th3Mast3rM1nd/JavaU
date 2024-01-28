import java.util.Scanner;

public class MethodChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Score : ");
        int score = scanner.nextInt();
        System.out.println("Enter the name of Player : ");
        String playerName = scanner.next();
        displayHighScorePosition(playerName, calculateHighScorePosition(score));
    }

    public static void displayHighScorePosition(String playerName, int scoreList) {
        System.out.println(playerName + " managed to get into position " + scoreList + " on the high score list");
    }

    public static int calculateHighScorePosition(int score) {
        int scoreResult = 4;
        if (score >= 1000) {
            scoreResult = 1;
        } else if (score >= 500) {
            scoreResult = 2;
        } else if (score >= 100) {
            scoreResult = 3;
        }
        return scoreResult;
    }
}
