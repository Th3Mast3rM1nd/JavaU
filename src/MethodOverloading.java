public class MethodOverloading {
    public static void main(String[] args) {
        int newScore = calculateScore("Youssef" , 500);
        System.out.println("New Score is " + newScore);
        newScore = calculateScore(90);
        System.out.println("New Score is " + newScore);

    }
    public static int calculateScore(String playerName, int score) {
        System.out.println("Player" + playerName + " scored " + score + " points");
        return score * 1000;

    }
    public static int calculateScore(int score) {
        System.out.println("Unnamed Player " + score + " points");
        return score * 1000;

    }
}
