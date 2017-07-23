import java.util.Scanner;

/**
 * Created by Tim Arman on 23/7/17.
 */
public class DrawingBook {
  static boolean startFromBegining(int n, int p){
    if(n/2>=p){
      return true;
    }
      return false;
  }

  static int solve(int n, int p){
    int numberOfPageTurns=0;

    if(startFromBegining( n,  p)){
      numberOfPageTurns=p/2;
    }
    else{
      numberOfPageTurns=(n-p)/2;
      if((n-p)==1 && n%2==0)
      {
        numberOfPageTurns=1;
      }
    }
    return numberOfPageTurns;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int p = in.nextInt();
    int result = solve(n, p);
    System.out.println(result);
  }

}
