public class WhileLoop {
    public static void main(String[] args) {
        int count = 1;
        boolean isFive = false;
        while (isFive == false ) {
           count++;
            System.out.println("Hello World!");
            if (count == 6) {
                isFive = true;
            }
        }
    }
}
