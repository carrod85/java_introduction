package ee.itcollage.level13;

import ee.itcollage.level11.Word;

import javax.swing.event.TreeExpansionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PalindromeWords {

    //todo write a program to analyze palindrome words
    // main method shows how to reverse a string
    // todo write tests for your code

    /**
     * palindrome is a word that is equal to itself reversed.
     * For example: radar (reversed radar) is a palindrome
     * cow (reversed woc) is not a palindrome
     */
    public AnalysisResult analyzePalindromes(List<String> strings){
        List<String> palindro = new ArrayList<>();
        List<String> other = new ArrayList<>();
        for (String word : strings){
            String wordrev = new StringBuilder(word).reverse().toString();
            if (word.equals(wordrev) ){
                palindro.add(word);
            }
            else{
                other.add(word);
            }

        }

        return new AnalysisResult(palindro,other);
    }

    public static void main(String[] args) {

        List<String> words = Arrays.asList("radar", "cola");
        PalindromeWords palindrome = new PalindromeWords();
        AnalysisResult analisis = palindrome.analyzePalindromes(words);
        analisis.palindromesToString();

       /* String palidrome = "radar";
        String reversedPalidrome = new StringBuilder(palidrome).reverse().toString();
        String other = "other";
        String otherReversed = new StringBuilder(other).reverse().toString();

        System.out.println(String.format("%s %s", palidrome, reversedPalidrome));
        System.out.println(String.format("%s %s", other, otherReversed));*/
    }
}