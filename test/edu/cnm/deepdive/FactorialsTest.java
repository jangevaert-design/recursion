package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class FactorialsTest {

  /**
   * tests a given array against an expected outcome with assertEquals
   * @param n, BigInteger
   * @return boolean
   * @throuws IllegalArgumentException when n < 0
   */

  static final int[] params = {
      0, 1, 5, 10, 13
  };

  static final BigInteger[] expecteds = {
      BigInteger.valueOf(1), BigInteger.valueOf(1), BigInteger.valueOf(120), BigInteger.valueOf(3628800), BigInteger.valueOf(6227020800L)
  };



  @Test
  void computeRecursive() {
//    for (long[] testCase : testCases) {
    for (int i = 0; i < params.length; i++) {
//      int n = (int) testCase[0];
//      long expected = testCase[1];
      int n = params[i];
      BigInteger expected = expecteds[i];
      long actual = Factorials.computeRecursive(n);
      assertEquals(expected, actual);
    }
    assertThrows(IllegalArgumentException.class, () -> Factorials.computeRecursive(-1));
  }


}