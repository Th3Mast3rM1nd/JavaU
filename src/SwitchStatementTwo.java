public class SwitchStatementTwo {
    public static void main(String[] args) {
        String month = "April";
        System.out.println(getQuarter(month));
    }

    public static String getQuarter(String month) {
        // Switch enhanced Expression
        return switch (month) {
            case "January", "Ferbruary", "March" -> "1st";
            case "April", "Mai", "June" -> "2nd";
            case "July", "August", "September" -> "3th";
            case "October", "Novomber", "December" -> "5th";
            default -> {
                String badResponse = month + " + bad";
                yield badResponse; // yield instead of return
            }
            };
        }
}

