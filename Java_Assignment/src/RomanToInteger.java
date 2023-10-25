//B. Enter a Roman Number as input and convert it to an integer. (eg IX = 9)
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine().toUpperCase();
        scanner.close();

        int result = romanToInteger(romanNumeral);
        System.out.println("Integer value: " + result);
    }

    public static int romanToInteger(String s) {
        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char romanChar = s.charAt(i);
            int numericValue = 0;

            switch (romanChar) {
                case 'I':
                    numericValue = 1;
                    break;
                case 'V':
                    numericValue = 5;
                    break;
                case 'X':
                    numericValue = 10;
                    break;
                case 'L':
                    numericValue = 50;
                    break;
                case 'C':
                    numericValue = 100;
                    break;
                case 'D':
                    numericValue = 500;
                    break;
                case 'M':
                    numericValue = 1000;
                    break;
            }

            if (numericValue < prevValue) {
                result -= numericValue;
            } else {
                result += numericValue;
            }

            prevValue = numericValue;
        }

        return result;
    }
}
