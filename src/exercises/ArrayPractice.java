package exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String [] args) {
        int[] numberArray = {1, 1, 2, 3, 5, 8};
        String seuss = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        for (int i : numberArray) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        String[] words = seuss.split(" ");
        String[] sentences = seuss.split("\\.");
        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.toString(sentences));
    }
}
