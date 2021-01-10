package exercises;

import java.util.Locale;
import java.util.Scanner;

public class AliceInWonderland {
    public static void main(String[] args) {
        String aliceQuote =
                "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'\n";
        System.out.println("Enter a string: ");
        aliceQuote = aliceQuote.toLowerCase();
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        userInput = userInput.toLowerCase();
        System.out.println(aliceQuote.indexOf(userInput));
        System.out.println(userInput.length());
        String newAliceQuote = aliceQuote.replaceFirst(userInput, "");
        System.out.println(newAliceQuote);
    }
}
