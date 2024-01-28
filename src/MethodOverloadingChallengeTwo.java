import java.util.GregorianCalendar;

public class MethodOverloadingChallengeTwo {
    public static void main(String[] args) {
        System.out.println(getDurationString(61));
        System.out.println(getDurationString(10,45));
        System.out.println(getDurationString(65,-45));
    }
    public static String getDurationString(int seconds)
    {
        String message = "";
        if (seconds >= 0 ) {
            message = getDurationString(seconds / 60,seconds % 60);
        } else {
            message = "Invalid Value";
        }
         return message;
    }
    public static String getDurationString(int minutes,int seconds) {
        String message = "";
        if (minutes >= 0 && seconds >= 0 && seconds <= 59) {
            int remainingMinutes = minutes % 60;
            int remainingSeconds = seconds % 60;
            int hours = minutes / 60;
            message = hours + "h " + remainingMinutes + "M " + remainingSeconds + "S ";
        } else {
            message = "Invalid Value";
        }
        return message;
    }
}
