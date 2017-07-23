import java.util.Scanner;

/**
 * Created by Tim Arman on 22/7/17.
 */
public class DivisibleSumPairs {
  static int divisibleSumPairs(int n, int k, int[] ar) {
    int numberOfDisivisblePairs=0;
    for(int i=0;i<n;i++)
    {
      for(int j=i+1;j<n;j++){
        if((ar[i]+ar[j])%k==0){
          numberOfDisivisblePairs++;
        }
      }
    }

    return numberOfDisivisblePairs;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int k = in.nextInt();
    int[] ar = new int[n];
    for(int ar_i = 0; ar_i < n; ar_i++){
      ar[ar_i] = in.nextInt();
    }
    int result = divisibleSumPairs(n, k, ar);
    System.out.println(result);
  }
}
