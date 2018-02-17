package Strings;

import java.util.Scanner;

/**
 * Created by Tim Arman on 23/9/17.
 */
// abcde  length = 5
  // i<4
public class SuperReducedString {

  static String super_reduced_string(String s){
    boolean reducable = true;
    StringBuilder sb = new StringBuilder(s);

    do{
      for(int i=0;i<sb.length()-1;i++){
        if(sb.charAt(i)==sb.charAt(i+1)){
          sb.deleteCharAt(i+1);
          sb.deleteCharAt(i);
        }else if(sb.length()==2){
          if(sb.charAt(0)==sb.charAt(1)){
            return "Empty String";
          }
        }
        else {
          if(sb.length()==0){
            return "Empty String";
          }
        reducable=false;}
      }

    }
    while (reducable);

    return sb.toString();
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s = in.next();
    String result = super_reduced_string(s);
    System.out.println(result);
  }


}
