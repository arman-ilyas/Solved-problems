import java.util.Scanner;

/**
 * Created by Tim Arman on 20/8/17.
 */
public class EqualizetheArray {
  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] myArray = new int[t];
        for(int i=0;i<t;i++){
          myArray[i]=in.nextInt();
        }
        int mostPopularNumberCount=0;
        int largestCount=0;
        for(int i=1; i<=100;i++){
          for(int j=0;j<t;j++) {
            if (i == myArray[j]) {
              mostPopularNumberCount++;
            }
          }
          if(mostPopularNumberCount>=largestCount){
            largestCount=mostPopularNumberCount;
            mostPopularNumberCount=0;
          }
        }
        if(t==1){
          System.out.println(0);
        }
        else {
    System.out.println(t-largestCount);}
  }
}
