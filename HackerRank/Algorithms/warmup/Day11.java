package warmup;

import java.util.Scanner;

/**
 * Created by ArmanGT on 01-Apr-17.
 */
public class Day11 {

  private static int getMaximumHourglassSum(int[][] arr) {
  int maxSum=arr[0][0]+arr[0][1]+arr[0][2]+
                       arr[1][1]+
             arr[2][0]+arr[2][1]+arr[2][2];
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        int hourGlassSum=arr[i][j]+arr[i][j+1]+arr[i][j+2]+
                                 arr[i+1][j+1]+
                         arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
        if(hourGlassSum>=maxSum){
          maxSum=hourGlassSum;
        }
      }
    }
    return maxSum;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int arr[][] = new int[6][6];
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 6; j++) {
        arr[i][j] = in.nextInt();
      }
    }
    System.out.println(getMaximumHourglassSum(arr));
  }

}
