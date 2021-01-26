public class PositiveNegative {
    public static void main(String args[]) {
        double num = 12.3;

        if(num < 0.0) {
            System.out.println("The given number is negative");
        }
        else if(num > 0.0) {
            System.out.println("The given number is positive");
        }
        else {
            System.out.println("The given number is zero");
        }
        return;
    }
}