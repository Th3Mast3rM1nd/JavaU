public class OverloadingChallenge {
    public static void main(String[] args) {
        System.out.println( " in Centimeters is " + convertToCentimeters(5,9));
    }
    public static double convertToCentimeters(int inch) {
        return inch * 2.54d;
    }
    public static double convertToCentimeters(int feet, int inch) {
        return convertToCentimeters((feet * 12 ) + inch);
    }
}
