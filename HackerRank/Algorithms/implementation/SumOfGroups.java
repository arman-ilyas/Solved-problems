import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Tim Arman on 4/12/17.
 */
public class SumOfGroups {
  static long sumOfGroup(int k) {
    long sum = 0;
    long a = k;
    long b = k - 1;
    long c = a * b +1;
    for (long i = 0; i < k; i++) {
      sum += c + i * 2;
    }
    return sum;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int k = in.nextInt();
    long answer = sumOfGroup(k);
    System.out.println(answer);
    in.close();
  }
}
