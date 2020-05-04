package ru.aaromanov1985.codewars.kata;

import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class SpinWords {

    /**
     * Write a function that takes in a string of one or more words,
     * and returns the same string, but with all five or more letter words
     * reversed (Just like the name of this Kata). Strings passed in will
     * consist of only letters and spaces. Spaces will be included only when
     * more than one word is present.
     * <p>
     * Examples: spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw"
     * spinWords( "This is a test") => returns "This is a test"
     * spinWords( "This is another test" )=> returns "This is rehtona test"
     */
    public String spinWords(String sentence) {
        StringTokenizer sk = new StringTokenizer(sentence);
        StringBuilder result = new StringBuilder();
        while (sk.hasMoreTokens()) {
            String s = sk.nextToken(" ");
            if (s.length() >= 5) {
                for (int i = s.length() - 1; i >= 0; i--) {
                    result.append(s.charAt(i));
                }
            } else {
                result.append(s);
            }

            if (sk.hasMoreTokens()) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    public String spinWordsOptimal(String sentence) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= 5) {
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }
        return String.join(" ", words);
    }

    public String spinWordsWithStream(String sentence) {
        return Arrays.stream(sentence.split(" "))
                .map(i -> i.length() > 4 ? new StringBuilder(i).reverse().toString() : i)
                .collect(Collectors.joining(" "));
    }
}