import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Tim Arman on 15/11/17.
 */
public class BetweenTwoSets {

  static int getTotalX(int[] a, int[] b) {
    List<Integer> filterA = new ArrayList<>();
    List<Integer> filterB = new ArrayList<>();

    for (int i = 1; i <= 100; i++) {
      int filterACounter = 0;
      for (int j = 0; j < a.length; j++) {
        if (i % a[j] == 0) {
          filterACounter++;
        }
      }
      if (filterACounter == a.length) {
        filterA.add(i);
      }
    }

    for (int i = 0; i < filterA.size(); i++) {
      int filterBCounter = 0;
      for (int j = 0; j < b.length; j++) {
        if (b[j] % filterA.get(i) == 0) {
          filterBCounter++;
        }
        if (filterBCounter == b.length) {
          filterB.add(i);
        }
      }
    }

    return filterB.size();
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();
    int[] a = new int[n];
    for(int a_i = 0; a_i < n; a_i++){
      a[a_i] = in.nextInt();
    }
    int[] b = new int[m];
    for(int b_i = 0; b_i < m; b_i++){
      b[b_i] = in.nextInt();
    }
    int total = getTotalX(a, b);
    System.out.println(total);
    in.close();
  }
}
