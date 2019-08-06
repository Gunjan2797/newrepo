import java.util.*;


class demo  
{  
    public static void main(String arg[])  
    {  
       

		int x, y, temp;
      System.out.println("Enter x and y");
      Scanner in = new Scanner(System.in);
     
      x = in.nextInt();
      y = in.nextInt();		
        System.out.println("value of x:"+x);  
        System.out.println("value of y:"+y);  
        System.out.println("After swapping");  
        x=x+y;  
        y=x-y;  
        x=x-y;  
        System.out.println("value of x:"+x);  
        System.out.println("value of y:"+y);  
    }  
}  