import java.util.Scanner;

/**
 * Created by Tim Arman on 22/7/17.
 */
public class Kangaroo {
  static String kangaroo(int x1, int v1, int x2, int v2) {
    int distanceX1=0;
    int distanceX2=0;
    if(x1>x2 && v1>v2){
      return "NO";
    }
    if(x2>x1 && v2>v1){
      return "NO";
    }
    for(int i=1;i<=10000;i++){
      distanceX1=x1+v1*i;
      distanceX2=x2+v2*i;
      if(distanceX1==distanceX2){
        return "YES";
      }
    }

    return "NO";

    // Complete this function
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int x1 = in.nextInt();
    int v1 = in.nextInt();
    int x2 = in.nextInt();
    int v2 = in.nextInt();
    String result = kangaroo(x1, v1, x2, v2);
    System.out.println(result);
  }
}
