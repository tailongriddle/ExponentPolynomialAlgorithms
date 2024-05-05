/***
 * 
 * Test Driver for Algorithms
 * 
 * @author tai
 *
 */
public class TestDriver extends Algorithms{
  
  public static void main(String args[]) {
    int x = 2;


/*
    // Check correctness for all instances System.out.println("2^0: " + ExponentDec(x, n));
    System.out.println("2^1: " + itExponentDec(x, 1));
    System.out.println("2^2: " + itExponentDec(x, 2));
    System.out.println("2^3: " + itExponentDec(x, 3));
    System.out.println("2^4: " + itExponentDec(x, 4));
    System.out.println("2^5: " + itExponentDec(x, 5));
    System.out.println("2^6: " + itExponentDec(x, 6));
    System.out.println("2^7: " + itExponentDec(x, 7));
    System.out.println("2^8: " + itExponentDec(x, 8));
    System.out.println("2^9: " + itExponentDec(x, 9));
    System.out.println("2^10: " + itExponentDec(x, 10));
    System.out.println("2^11: " + itExponentDec(x, 11));
    */

    /*
     * int a = 2; int n = 3;
     * 
     * System.out.println(NaivePolynomial(2, a, n) + " = 30"); // 2 + 4 + 8 + 16
     * System.out.println(NaivePolynomial(1, a, n) + " = 8"); // 2 + 2 + 2 + 2
     * System.out.println(NaivePolynomial(0, a, n) + " = 2"); // 2 + 0 + 0 + 0
     * 
     * System.out.println(NaivePolynomial(x, 1, n) + " = 15"); // 1 + 2 + 4 + 8
     * System.out.println(NaivePolynomial(x, 0, n) + " = 0"); // 0 + 0 + 0 + 0
     * 
     * System.out.println(NaivePolynomial(x, a, 1) + " = 6"); // 2 + 4
     * System.out.println(NaivePolynomial(x, a, 2) + " = 14"); // 2 + 4 + 8
     * System.out.println(NaivePolynomial(x, a, 0) + " = 2"); // 2
     * 
     * 
     * 
     * 
     * System.out.println(HornerPolynomial(2, a, n) + " = 30"); // 2 + 4 + 8 + 16
     * System.out.println(HornerPolynomial(1, a, n) + " = 8"); // 2 + 2 + 2 + 2
     * System.out.println(HornerPolynomial(0, a, n) + " = 2"); // 2 + 0 + 0 + 0
     * 
     * System.out.println(HornerPolynomial(x, 1, n) + " = 15"); // 1 + 2 + 4 + 8
     * System.out.println(HornerPolynomial(x, 0, n) + " = 0"); // 0 + 0 + 0 + 0
     * 
     * System.out.println(HornerPolynomial(x, a, 1) + " = 6"); // 2 + 4
     * System.out.println(HornerPolynomial(x, a, 2) + " = 14"); // 2 + 4 + 8
     * System.out.println(NaivePolynomial(x, a, 0) + " = 2"); // 2
     */



    int a = 2;
    long startTime = 0;

    System.out.println("Naive Polynomial: ");
    int numberOfTrials = 1000;
    for (int n = 0; n < 1000; n += 100) {
      startTime = System.currentTimeMillis();
      for (int i = 0; i < numberOfTrials; i++) {
        NaivePolynomial(x, a, n);
      }
      long endTime = System.currentTimeMillis();
      System.out.print(n + "  ");

      System.out.println((endTime - startTime) / ((double) numberOfTrials));
    } 
    System.out.println("");


    System.out.println("Horner Polynomial: ");
    for (int n = 0; n < 1000; n += 100) {
      startTime = System.currentTimeMillis();
      for (int i = 0; i < numberOfTrials; i++) {
        HornerPolynomial(x, a, n);
      }
      long endTime = System.currentTimeMillis();
      System.out.print(n + "  ");
      System.out.println((endTime - startTime) / ((double) numberOfTrials));
    }
    System.out.println("");


    startTime = 0;
    System.out.println("Brute Force O(n): ");
    numberOfTrials = 1200;
    for (int n = 0; n < 5000; n += 500) {
      startTime = System.currentTimeMillis();
      for (int i = 0; i < numberOfTrials; i++) {
        Exponent(x, n);
      }
      long endTime = System.currentTimeMillis();
      System.out.print(n + "  ");
      System.out.println((endTime - startTime) / ((double) numberOfTrials));
    }

    System.out.println("");


    System.out.println("Decrease and Conquer Olog(n): ");
    for (int n = 0; n < 5000; n += 500) {
      startTime = System.currentTimeMillis();
      for (int i = 0; i < numberOfTrials; i++) {
        ExponentDec(x, n);
      }
      long endTime = System.currentTimeMillis();
      System.out.print(n + "  ");
      System.out.println((endTime - startTime) / ((double) numberOfTrials));
    }

    
    System.out.println("");


  }



}



  

  

