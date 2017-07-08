import java.util.Scanner;

/**
 * Created by Tim Arman on 8/7/17.
 */
public class SockMerchant {

  static int sockMerchant(int n, int[] ar) {
  int totalPairsToSell=0;
  for(int i=1;i<=100;i++){
    int pairs=0;
    for(int j=0;j<n;j++){
      if(i==ar[j]){
        pairs++;
      }
    }
    totalPairsToSell+=pairs/2;
  }

  return totalPairsToSell;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] ar = new int[n];
    for(int ar_i = 0; ar_i < n; ar_i++){
      ar[ar_i] = in.nextInt();
    }
    int result = sockMerchant(n, ar);
    System.out.println(result);
  }

}
