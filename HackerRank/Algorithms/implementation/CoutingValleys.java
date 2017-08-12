import java.util.Scanner;

/**
 * Created by Tim Arman on 30/7/17.
 */
public class CoutingValleys {

  static int countValleys(int n, String steps) {
    int valleyCount = 0, ups = 0, downs = 0;
    boolean isSeaLevel = true;
    char direction = 'x';

    for (int i = 0; i < n; i++) {
      if (isSeaLevel && steps.charAt(i) == 'D') {
        valleyCount++;
        direction = 'd';
      }
      if (steps.charAt(i) == 'U') {
        ups++;
      }
      if (steps.charAt(i) == 'D') {
        downs++;
      }
      if (ups == downs) {
        if (direction == 'd') {
        }
        isSeaLevel = true;
      } else {
        isSeaLevel = false;
      }
    }

    return valleyCount;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int numberOfSteps = in.nextInt();
    String steps = in.next();
    System.out.println(countValleys(numberOfSteps, steps));
  }
}
