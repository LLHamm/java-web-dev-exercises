package org.launchcode.java.studios.countingcharacters2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
        HashMap<Character, Integer> characterCounts = new HashMap<>();
        Scanner in = new Scanner(System.in);
        String testString;

        System.out.println("Enter the text for which you would like a character count: ");
        testString = in.nextLine();

        char[] charactersInString = testString.toCharArray();

        for (char character : charactersInString) {
            if (characterCounts.containsKey(character)) {
                characterCounts.put(character, characterCounts.get(character) + 1);
            }
            else {
                characterCounts.put(character, 1);
            }
        }

        for (Map.Entry<Character, Integer> eachChar : characterCounts.entrySet()) {
            System.out.println(eachChar.getKey() + ": " + eachChar.getValue());
        }
    }
}
