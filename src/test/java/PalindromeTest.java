import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome palindromeChecker;

    @Before
    public void beforeTest(){
        palindromeChecker = new Palindrome();

    }

    @Test
    public void checkIfSentenceIsAPalindrome() {
        String sentence = "ala";
        boolean condition = palindromeChecker.isApalindrome(sentence);
        Assert.assertTrue(condition);
    }


    @Test
    public void checkIfSentenceIsAPalindrome_Spaces() {
        String sentence = "Was it a car or a cat I saw";
        boolean condition = palindromeChecker.isApalindrome(sentence);
        Assert.assertTrue(condition);
    }

    @Test
    public void checkIfSentenceIsAPalindrome_SpecialChar() {
        String sentence = "No 'x' in \" Nixon\" !!! ";
        boolean condition = palindromeChecker.isApalindrome(sentence);
        Assert.assertTrue(condition);
    }

    @Test
    public void checkIfSentenceIsAPalindrome_LowerCase() {
        String sentence = "TACO CAT";
        boolean condition = palindromeChecker.isApalindrome(sentence);
        Assert.assertTrue(condition);
    }


    @Test
    public void checkIfSentenceIsNotAPalindrome() {
        String sentence = "Taco cat is, a nice cat";
        boolean condition = palindromeChecker.isApalindrome(sentence);
        Assert.assertFalse(condition);
    }
}