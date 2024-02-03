import java.util.Currency;
import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        int currentYear = 2022;
        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }


    }

    public static String getInputFromConsole(int currentYear) {
        // runs only on Terminal
        String name = System.console().readLine("Hi, What's Your Name? ");
        String dateOfBirth = System.console().readLine("Whats Your Age? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "So you are" + age + "years old";
    }

    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Whats Your name ");
        String name = scanner.nextLine();
        System.out.println("Whats year were you born");
        boolean validDob = false;
        int age = 0;
        do {
            try {
                System.out.println("Enter a year of birth >= " + (currentYear - 125) + "and <= " + (currentYear));
                age = checkData(currentYear, scanner.nextLine());
                validDob = age < 0 ? false : true;
            } catch (NumberFormatException e) {
                System.out.println("Characters not allowed!! try again");
            }

        } while (!validDob);
        return "so you are " + age + "Old";
    }

    public static int checkData(int currentYear, String dateOfBirth) {
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;
        if ((dob < minimumYear) || (dob > currentYear)) {
            return -1;
        }
        return (currentYear - dob);
    }
}
