package implementation;

import java.util.Scanner;

/**
 * Created by Tim Arman on 02-Jul-17.
 */
public class BeautifulDaysAtTheMovies {
  static int getRevers(int n){
    String number= new StringBuilder(Integer.toString(n)).reverse().toString();
    int result = Integer.parseInt(number);
    return result;
  }

  static int countBeautifulDays(int startDay, int endDay, int dividend){
    int beautifulDays=0;
    for(int i=startDay;i<=endDay;i++){
      if((Math.abs(i-getRevers(i)))%dividend==0)
      {
        beautifulDays++;
      }
    }


    return beautifulDays;
  }
  public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner in = new Scanner(System.in);
    int startDay = in.nextInt();
    int endDay = in.nextInt();
    int dividend = in.nextInt();
    System.out.println(countBeautifulDays(startDay,endDay,dividend));
  }



}
