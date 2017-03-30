package warmup;

import java.util.Scanner;

/**
 * Created by Hottea on 30-Mar-17.
 */
public class Day10of30dayCodeChallenge {

  public static int numberOfConsecutiveOnes(int digit) {
    String binaryRepresentation = Integer.toBinaryString(digit);
    int maximumNumberOfConsecutiveOnes = 0, recordStrike = 0;
    for (int i = 0; i < binaryRepresentation.length(); i++) {
      if (binaryRepresentation.charAt(i) == '1') {
        maximumNumberOfConsecutiveOnes++;
        if (maximumNumberOfConsecutiveOnes >= recordStrike) {
          recordStrike = maximumNumberOfConsecutiveOnes;
        }
      } else {
        maximumNumberOfConsecutiveOnes = 0;
      }
    }
    return recordStrike;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int digit = in.nextInt();
    System.out.println(numberOfConsecutiveOnes(digit));
  }

}
