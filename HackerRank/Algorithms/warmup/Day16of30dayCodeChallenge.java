package warmup;

import java.util.Scanner;

/**
 * Created by Tim Arman on 14-May-17.
 */
public class Day16of30dayCodeChallenge {
  private static int isGoodString(String s) throws NumberFormatException {
    int foo = Integer.parseInt(s);
    return foo;
  }
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try{
          System.out.println(isGoodString(S));
        }
        catch (NumberFormatException e){
          System.out.println("Bad String");
        }
      }
    }
