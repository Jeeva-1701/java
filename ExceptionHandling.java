import java.io.*;
import java.util.*;

public class ExceptionHandling {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try{
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
           
            int b = sc.nextInt();
          
            int c = a/b;
            System.out.print(c);
        }
        catch(InputMismatchException ob){
            System.out.print("java.util.InputMismatchException");
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
    }
}
