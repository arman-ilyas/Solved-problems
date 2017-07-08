package implementation;

import java.util.Scanner;

/**
 * Created by Tim on 8/7/17.
 */
public class BonAppetit {

  static int bonAppetit(int n, int k, int b, int[] ar) {
    int total = 0;
    for (int i = 0; i < n; i++) {
      total += ar[i];
    }
    int correctTotal = total - ar[k];
    int splitBill = correctTotal / 2;
    if (splitBill == b) {
      total = -1;
    } else {
      total = b - splitBill;
    }

    return total;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int k = in.nextInt();
    int[] ar = new int[n];
    for (int ar_i = 0; ar_i < n; ar_i++) {
      ar[ar_i] = in.nextInt();
    }
    int b = in.nextInt();
    int result = bonAppetit(n, k, b, ar);
    System.out.println(result == -1 ? "Bon Appetit" : result);
  }

}
