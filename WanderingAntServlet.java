//Import required java libraries
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

class Ant {

   public Ant() {
   }

   // initalizing the board
   int numberOfRows = 240;
   int numberOfColumns = 240;
   int positionX = numberOfRows / 2;
   int positionY = numberOfColumns / 2;
   char[][] board = new char[numberOfRows][numberOfColumns];

   // which side ant's head is looking
   String antsHeadFacingSide = "North";

   int getNumberOfBlackSquares(long numberOfSteps, String antHeadFacingSide, int initialPositionX,
         int initialPositionY) {

      int numberOfBlackSquares = 0;

      // Around step 10000 the moves started to run in pattern
      for (int step = 0; step < numberOfSteps; step++) {
         if (board[positionX][positionY] == '\u0000') {
            switch (antsHeadFacingSide) {
            case "North":
               board[positionX][positionY] = 'b';
               numberOfBlackSquares++;
               // test if the edge case
               if ((positionX + 1) == numberOfColumns) {
                  positionX = 0;
                  // corner case detected reset the board
               } else {
                  positionX += 1;
               }
               antsHeadFacingSide = "East";
               break;
            case "East":
               board[positionX][positionY] = 'b';
               numberOfBlackSquares++;
               // test if the edge case
               if ((positionY - 1) == -1) {
                  positionY = numberOfRows - 1;
                  // corner case detected reset the board
               } else {
                  positionY -= 1;
               }
               antsHeadFacingSide = "South";
               break;
            case "South":
               board[positionX][positionY] = 'b';
               numberOfBlackSquares++;
               // test if the edge case
               if ((positionX - 1) == -1) {
                  // corner case detected reset the board
                  positionX = numberOfColumns - 1;
               } else {
                  positionX -= 1;
               }
               antsHeadFacingSide = "West";
               break;
            case "West":
               board[positionX][positionY] = 'b';
               numberOfBlackSquares++;
               // test if the edge case
               if ((positionY + 1) == numberOfRows) {
                  positionY = 0;
                  // corner case detected reset the board
               } else {
                  positionY += 1;
               }
               antsHeadFacingSide = "North";
               break;
            }
         } else {
            switch (antsHeadFacingSide) {
            case "North":
               board[positionX][positionY] = '\u0000';
               numberOfBlackSquares--;
               // test if the edge case
               if ((positionX - 1) == -1) {
                  positionX = numberOfColumns - 1;
                  // corner case detected reset the board
               } else
                  positionX -= 1;
               antsHeadFacingSide = "West";
               break;
            case "West":
               board[positionX][positionY] = '\u0000';
               numberOfBlackSquares--;
               // test if the edge case
               if ((positionY - 1) == -1) {
                  positionY = numberOfRows - 1;
                  // corner case detected reset the board
               } else
                  positionY -= 1;
               antsHeadFacingSide = "South";
               break;
            case "South":
               board[positionX][positionY] = '\u0000';
               numberOfBlackSquares--;
               // test if the edge case
               if ((positionX + 1) == numberOfColumns) {
                  positionX = 0;
                  // corner case detected reset the board
               } else
                  positionX += 1;
               antsHeadFacingSide = "East";
               break;
            case "East":
               board[positionX][positionY] = '\u0000';
               numberOfBlackSquares--;
               // test if the edge case
               if ((positionY + 1) == numberOfRows) {
                  positionY = 0;
                  // corner case detected reset the board
               } else
                  positionY += 1;
               antsHeadFacingSide = "North";
               break;
            }
         }
      }
      return numberOfBlackSquares;
   }
   // using wrapper data type, so can convert to string later
   Integer move(long numberOfSteps) {
      int numberOfBlackSquaresBefore10000 = getNumberOfBlackSquares(10000, "North", 120, 120);
      // there is pattern where starting around move 10.000 the ant enters the
      // highway and his path
      // starts to repeat itself. Ant draws same figure every 104 steps, and
      // during this time it leaves
      // 12 black squares. So we can shortcut the repeating part
      int blackSquaresInBetween10000andNumberOfSteps = (int) ((numberOfSteps - 10000) / 104 * 12);
      // here we are calculating the number of last remaining squares that ant
      // needs to move
      int remainingSquares = (int) ((numberOfSteps - 10000) % 104);

      // now we are calculating how many black dots are there in the remaining
      // part, we just imagine,
      // if the ant continues from step 10001
      int remainingBlackSquares = getNumberOfBlackSquares(remainingSquares, antsHeadFacingSide, positionX, positionY);

      // add number of black squares before step 10.000 then between 10.000
      // and X. Here remaingingBlackSquares represent the
      // dots that are inside the last chunk
//    System.out.println(
//          numberOfBlackSquaresBefore10000 + blackSquaresInBetween10000andNumberOfSteps + remainingBlackSquares);
      return numberOfBlackSquaresBefore10000 + blackSquaresInBetween10000andNumberOfSteps + remainingBlackSquares;
   }
}
//Extend HttpServlet class
public class WanderingAntServlet extends HttpServlet {

private String message,message1;

public void init() throws ServletException
{
   // Do required initialization
   final long MAX_NUMBER_OF_MOVES = (long) Math.pow(10, 8);
   final long MAX_NUMBER_OF_MOVES2 = (long) Math.pow(10, 18);
   Ant a = new Ant();
      String result = (a.move(MAX_NUMBER_OF_MOVES)).toString();
      String result1 = (a.move(MAX_NUMBER_OF_MOVES2)).toString();
      //System.out.println(result);
   message = result;
   message1 = result1;
}

public void doGet(HttpServletRequest request,
                 HttpServletResponse response)
         throws ServletException, IOException
{
   // Set response content type
   response.setContentType("text/html");

   // Actual logic goes here.
   PrintWriter out = response.getWriter();
   out.println("<h1> Number of black squares after 10^8 steps are "+ message + "</h1>");
   out.println("<h1> Number of black squares after 10^18 steps are "+ message1 + "</h1>");
}

public void destroy()
{
   // do nothing.
}
}