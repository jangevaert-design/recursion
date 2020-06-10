package edu.cnm.deepdive;

import static java.math.BigInteger.valueOf;

import java.math.BigInteger;

public class Factorials {

  /**
   * Computes the factorial function value (n!) for the provided parameter value.
   * Changed return type from long to Big Integer to avoid incorrect outcomes
   * on n >21
   * @param n
   * @return the computed value of n!
   * @throws IllegalArgumentException when n < 0
   */
  public static BigInteger computeRecursive(int n) throws IllegalArgumentException {
    int result;
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    if (n == 0) {
      result = 1;

    } else {
      result = valueOf((n - 1).multiply(computeRecursive()) * n);
    }
    return valueOf(result);
  }

  private static BigInteger computeRecursive() {
    return null;
  }


  public static long computeIterative(int n) throws IllegalArgumentException {
    int result;
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    if (n == 0) {
      result = 1;

    } else {
      result = (int) (n * factorial(n - 1));
    }
    return result;
  }

  private static int factorial(int i) {
    return 0;
  }
}