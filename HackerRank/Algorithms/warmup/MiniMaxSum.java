package warmup;

import java.util.Scanner;

/**
 * Created by Tim Arman on 25-Jun-17.
 * hacherrank->algorithms->warmup-> Mini Max Sum
 */
public class MiniMaxSum {

  public static long findMinSum(int[] arr) {
    long minSum = 0;
    int highestValue = arr[0];

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > highestValue) {
        highestValue = arr[i];
      }
    }
    // find the minsum
    for (int i = 0; i < arr.length; i++) {
      minSum += arr[i];
    }

    return minSum - highestValue;
  }

  public static long findMaxSum(int[] arr) {
    long maxSum = 0;
    int lowestValue = arr[0];

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < lowestValue) {
        lowestValue = arr[i];
      }
    }
    // find the minsum
    for (int i = 0; i < arr.length; i++) {
      maxSum += arr[i];
    }
    return maxSum - lowestValue;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] arr = new int[5];
    for (int arr_i = 0; arr_i < 5; arr_i++) {
      arr[arr_i] = in.nextInt();
    }
    System.out.print(findMinSum(arr) + " " + findMaxSum(arr));
  }
}

