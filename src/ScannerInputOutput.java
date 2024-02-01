public class ScannerInputOutput {
    public static void main(String[] args) {
        int currentYear = 2022;
        System.out.println(getInputFromConsole(currentYear));
        System.out.println(getInputFromScanner(currentYear));
    }
    public static String getInputFromConsole(int currentYear) {
        // runs only on Terminal
        String name = System.console().readLine("Hi, What's Your Name?");
        return name;

    }
    public static String getInputFromScanner(int currentYear) {
        return "";
    }
}
