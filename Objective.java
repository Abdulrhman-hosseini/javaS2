import java.util.Locale;
import java.util.Scanner;

public class Objective {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence");

        String sentence = scanner.nextLine();
        String upperCase =sentence.toUpperCase();
        int length= sentence.length();
        char firstChar = sentence.charAt(0);

        System.out.println("upperCase: " + upperCase);
        System.out.println("length: " + length);
        System.out.println("firstChar: " + firstChar);


    }
}
