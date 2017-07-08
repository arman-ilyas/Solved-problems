package implementation;

import java.util.Scanner;

/**
 * Created by Tim Arman on 01-Jul-17.
 */
public class AppleAndOrange {
 /* static boolean inRange(int houseStart, int houseEnd, int tree, int fruitFromTreeDistance, boolean isApple ){

    return false;
  }
  static void getNumberOfApplesAndOranges(int houseStart, int houseEnd, ){
    int apples=0;
    int oranges=0;

  }*/

  public static void main(String[] args) {
    int apples=0;
    int oranges=0;
    Scanner in = new Scanner(System.in);
    int s = in.nextInt();
    int t = in.nextInt();
    int a = in.nextInt();
    int b = in.nextInt();
    int m = in.nextInt();
    int n = in.nextInt();
    int[] apple = new int[m];
    for(int apple_i=0; apple_i < m; apple_i++){
      apple[apple_i] = in.nextInt();
      if(apple[apple_i]+a>=s && apple[apple_i]+a<=t){
        apples++;
      }
    }
    int[] orange = new int[n];
    for(int orange_i=0; orange_i < n; orange_i++){
      orange[orange_i] = in.nextInt();
      if(orange[orange_i]+b>=s && orange[orange_i]+b<=t){
        oranges++;
      }
    }

    System.out.println(apples);
    System.out.println(oranges);


  }


}
