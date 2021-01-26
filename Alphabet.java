public class Alphabet {
    public static void main(String args[]) {
        char c = '*';

        if((c>='a' && c<='z') || (c>='A' && c<='Z')) {
            System.out.println("It is an Alphabet");
        } 
        else {
            System.out.println("It is not an Alplabet");
        }
        return;
    }
}