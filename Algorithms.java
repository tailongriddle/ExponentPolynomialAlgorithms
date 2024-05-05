
/***
 * 
 * Algorithms Class
 * 
 * @author tai
 *
 */
public class Algorithms {

  // compute x^n
  // 1. Brute force


  public static int Exponent(int x, int n) {

    int result = 1; // result is one (in case n is 0)

    {

      for (int i = 0; i < n; i++) {
        result = result * x; // result is result * x
      }



    }

    return result; // return result
  }

  // 2. Decrease and Conquer
  public static int ExponentDec(int x, int n) {
    int result = 1; // result is one (in case n is 0)

    if (n != 0) { // if n is not zero
      result = ExponentDec(x, n / 2); // recursive call to function that divides n

      if (n % 2 == 0) { // if n is even
        return result * result; // return n squared
      } else // if n is odd
        return x * result * result; // return n squared times x
    }


    return result; // return result

  }

  public static int itExponentDec(int x, int n) {
    int result = 1; // result is one (in case n is 0)

    if (n != 0) { // if n is not zero
      result = x;
      while (n != 1) {

        if (n % 2 == 0) { // if n is even
          result = result * result; // return n squared
        } else if (n % 2 != 0) {// if n is odd
          result = x * result * result; // return n squared times x
          n = n - 1;
        }
        n = n / 2;
      }


    }


    return result; // return result

  }

  public static double NaivePolynomial(double x, double a, int n) {
    double result = a; // this is for if n = 0
    double currentX = x;

    for (int i = 0; i < n; i++) { // do loop n times
      currentX = x; // (re)set currentX to x value
      for (int j = 0; j < i; j++) { // during loop, compute x^n for each item in polynomial
        currentX = currentX * x; // result is result + (result * x) basically x ^ whatever n
      }
      result = result + (a * currentX); // adds another item from polynomial
    }


    return result; // return result


  }

  public static double HornerPolynomial(double x, double a, int n) {
    double result = a; // this is for if n = 0

    if (n != 0) { // if n is not 0
      n--; // decrease n by 1
      result = result + (x * HornerPolynomial(x, a, n)); // result is a recursive call that
      // multiplies x by the call itself and adds to result (which starts at a)

    }


    return result; // return result


  }


  /*
   * 
   * int nOriginal = n;
   * 
   * if (n != 0) { result = result * x; // result * x
   * 
   * while (n != 1) { // while n is not one result = result * result; // result squared
   * 
   * if (n % 2 == 0) { // if n is even n = n / 2; // n is divided by 2 }
   * 
   * else if (n % 2 != 0) { // if n is odd oddTracker++; // add one to oddTracker n = (n - 1) / 2;
   * // n - 1 divided by 2
   * 
   * }
   * 
   * } for (int i = 0; i < oddTracker; i++) { // for every odd number, do result ^ oddTracker result
   * = result * x; // result is result * x } }
   */


}