import java.util.Scanner;

/**
 * Created by Tim Arman on 19/8/17.
 */
public class CatsandaMouse {

  static String catcher(int x, int y, int z) {
    int catAtoMouseDistance = Math.abs(z - x);
    int catBtoMouseDistance = Math.abs(z - y);
    if (catAtoMouseDistance < catBtoMouseDistance) {
      return "Cat A";
    } else if (catAtoMouseDistance > catBtoMouseDistance) {
      return "Cat B";
    } else {
      return "Mouse C";
    }
  }
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int q = in.nextInt();
    for(int a0 = 0; a0 < q; a0++){
      int x = in.nextInt();
      int y = in.nextInt();
      int z = in.nextInt();
      System.out.println(catcher(x,y,z));
    }
  }
}
