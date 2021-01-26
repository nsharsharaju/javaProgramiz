import java.util.Scanner;

public class FactorialRecursive {
    public static void main (String args[]) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Please enter the input : ");
        int input = reader.nextInt();

        long result = factorial(input);
        System.out.println("The output is "+ result);
    }

    public static long factorial(int num) {
        if(num < 1) {
            return 1;
        }
        else {
            return num * factorial(num-1);
        }
    }
}