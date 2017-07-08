package warmup;

import java.util.Scanner;

/**
 * Created by Tim Arman on 25-Jun-17.
 * hacherrank->algorithms->warmup-> Time Conversion
 */
public class TimeConversion {
  static String timeConversion(String s) {
    // find out if am or pm
    // perform calculation based on am or pm
    String militaryTimeFormat="";
    boolean isMorning = true;
    if (s.charAt(8) == 'P') {
      isMorning = false;
    }
    if(s=="12:00:00AM")
      return "00:00:00";

    if(isMorning){
      // 12.05am -> 00.05am
      if(s.charAt(0)=='1' && s.charAt(1)=='2'){
        for(int i=2;i<s.length()-2;i++){
          militaryTimeFormat+=s.charAt(i);
        }
        String correction="00";
        String militaryTimeFormatCorrectedForPM=correction + militaryTimeFormat;
        return militaryTimeFormatCorrectedForPM;
      }else{
      for(int i=0;i<s.length()-2;i++){
        militaryTimeFormat+=s.charAt(i);}
      }
    return militaryTimeFormat;
    }
    else{
      if(s.charAt(0)=='1' && s.charAt(1)=='2'){
        for(int i=2;i<s.length()-2;i++){
          militaryTimeFormat+=s.charAt(i);
        }
        String correction="12";
        String militaryTimeFormatCorrectedForPM=correction + militaryTimeFormat;
        return militaryTimeFormatCorrectedForPM;
      }
      else {
        for (int i = 2; i < s.length() - 2; i++) {
            militaryTimeFormat+= s.charAt(i);
        }
      int x = Character.getNumericValue(s.charAt(0))*10 + Character.getNumericValue(s.charAt(1));
      int correction=x+12;
      String militaryTimeFormatCorrectedForPM=Integer.toString(correction) + militaryTimeFormat;
      return militaryTimeFormatCorrectedForPM;
      }
    }

  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s = in.next();
    String result = timeConversion(s);
    System.out.println(result);
  }
}
