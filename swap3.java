import java.util.Scanner;
 
class SwapNumbers
{
//Program for swapping
   public static void main(String args[])
   {
      int x, y, temp;
      System.out.println("Enter x and y");
      System.out.println("Hey");
      System.out.println("making change for pull");

      Scanner in = new Scanner(System.in);
     
      x = in.nextInt();
      y = in.nextInt();
     
      System.out.println("Before Swapping\nx = "+x+"\ny = "+y);
     
      temp = x;
      x = y;
      y = temp;
     
      System.out.println("After Swapping\nx = "+x+"\ny = "+y);
   }
}
