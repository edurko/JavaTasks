public class Palindrome {

    public boolean isApalindrome(String sentence) {

        sentence = sentence.toLowerCase().replaceAll("[\\s-,\"'.;!?]+", "");
        //String reverseString = "";
        StringBuilder newString = new StringBuilder(sentence);
        newString = newString.reverse();
        String reverseString = newString.toString();

        if (sentence.equals(reverseString)) {
            return true;
        }
        return false;
    }
}

