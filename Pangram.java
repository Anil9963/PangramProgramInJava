package cloudVandana;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangram {
    public static boolean isPangram(String input) {
        input = input.toUpperCase();
        Set<Character> charSet = new HashSet<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                charSet.add(c);
            }
        }
        return charSet.size() == 26;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        if (isPangram(sentence)) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
        scanner.close();
    }
}