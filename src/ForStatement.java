public class ForStatement {
    public static void main(String[] args) {
        // for (init; expression; increment)
        // for (int i; i <= 5; i++)
        for (double rate = 7.5; rate <= 10.0; rate += 0.25) {
            System.out.println("10,000 at " + rate + " interest = " + calculateInterest(10000.0, rate));
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
