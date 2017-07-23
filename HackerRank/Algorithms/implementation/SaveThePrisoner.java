import java.util.Scanner;

/**
 * Created by Tim Arman on 9/7/17.
 */
public class SaveThePrisoner {
  static int saveThePrisoner(int prisonerCount, int numberofSweets, int startId) {
    // Complete this function
    int idOfPrisonerToWarn = 0;
    idOfPrisonerToWarn = numberofSweets%prisonerCount+startId-1;
    return idOfPrisonerToWarn;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for (int a0 = 0; a0 < t; a0++) {
      int n = in.nextInt();
      int m = in.nextInt();
      int s = in.nextInt();
      int result = saveThePrisoner(n, m, s);
      System.out.println(result);
    }
  }
}
