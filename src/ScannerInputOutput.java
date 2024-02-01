import java.util.Scanner;

public class ScannerInputOutput {
    public static void main(String[] args) {
        int currentYear = 2022;
        try {
            System.out.println(getInputFromConsole(currentYear));
        }catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }


    }
    public static String getInputFromConsole(int currentYear) {
        // runs only on Terminal
            String name = System.console().readLine("Hi, What's Your Name? ");
            String dateOfbirth = System.console().readLine("Whats Your Age? ");
            int age = currentYear - Integer.parseInt(dateOfbirth);
            return "So you are" + age + "years old";
        }
    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Whats Your name ");
        String name = scanner.nextLine();
        System.out.println("Whats year were you born");
        String dateOfbirth = scanner.nextLine();
        int age = currentYear - Integer.parseInt(dateOfbirth);
        return "so you are " + age + "Old";
    }
}