package edu.cnm.deepdive;

public class Palindromes {

  /**
   * computes whether the provided String parameter is a palindrome
   * @param input
   * @return true if input is a palindrome
   */

  public static boolean testRecursive(String input) {
    return input.length() <= 1
        || (
        input.charAt(0) == input.charAt(input.length() - 1)
            && testRecursive(input.substring(1, input.length() - 1))
    );
  }

  public static boolean testDenormalized(String covert) {
    String lettersOnly = (String.removeAll("[\\W_]+")).toLowerCase();
    testRecursive(lettersOnly);
    return covert.length() <= 1
        || (
        covert.charAt(0) == covert.charAt(covert.length() - 1)
            && testRecursive(covert.substring(1, covert.length() - 1))
    );
  }

}




