//C. Check if the input is pangram or not. (Pangram is a sentence that contains all the alphabet from a-z) 
import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine().toLowerCase(); // Convert to lowercase for case-insensitivity
        scanner.close();

        boolean isPangram = isPangram(input);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        boolean[] alphabet = new boolean[26]; // 26 letters in the English alphabet

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                int index = ch - 'a';
                alphabet[index] = true;
            }
        }

        for (boolean letter : alphabet) {
            if (!letter) {
                return false; // If any letter is missing, it's not a pangram
            }
        }

        return true; // All letters are present
    }
}
