import java.util.Scanner;

public class FactorialWhile {
    public static void main (String args[]) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Please enter the number: ");
        int num = reader.nextInt();

        int factorial =  1;
        
        while(num > 1) {
            factorial*=num;
            num--;
        }
        System.out.println("Factorial is " + factorial);
    }
}