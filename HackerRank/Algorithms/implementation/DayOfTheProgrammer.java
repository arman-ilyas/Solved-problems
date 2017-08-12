import java.util.Scanner;

/**
 * Created by Tim Arman on 29/7/17.
 */
public class DayOfTheProgrammer {
  static boolean isGregorianCalendar(int year){
    if(year>1918){
      return true;
    }
    return false;
  }
  static String solve(int year){
    if(year == 1918){
      return "26.09.1918";
    }
    if(isGregorianCalendar(year)){
      if(year%400==0 || (year%4==0&&year%100!=0)){
        return "12.09."+year;
      }
      else {
        return "13.09."+year;
      }
    }
    else{
      if(year%4==0){
        // return leap
        return "12.09."+year;
      }
      else{
        return "13.09."+year;
      }

    }
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    while(true){
    int year = in.nextInt();
    String result = solve(year);
    System.out.println(result);
    }
  }
}
