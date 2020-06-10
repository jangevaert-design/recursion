package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromesTest {

  /**
   * tests a given parameter whether or not it is a palindrome with assertTrue and
   * assertFalse
   * @ return boolean
   */

  @Test
  void testRecursive() {
    assertTrue(Palindromes.testRecursive("radar"));
    assertFalse(Palindromes.testRecursive("sonar"));
    assertTrue(Palindromes.testRecursive("abba"));
    assertFalse(Palindromes.testRecursive("abb"));
    assertTrue(Palindromes.testRecursive("X"));
    assertTrue(Palindromes.testRecursive(""));
  }

  @Test
  void testDenormalized() {
    assertTrue(Palindromes.testDenormalized("radar"));
    assertTrue(Palindromes.testDenormalized("Radar"));
    assertTrue(Palindromes.testDenormalized("A man, a plan, a canal - Panama!"));
    assertFalse(Palindromes.testDenormalized("A man, a plan, a dam - Hoover!"));
    assertTrue(Palindromes.testDenormalized("aBbA"));

  }
}