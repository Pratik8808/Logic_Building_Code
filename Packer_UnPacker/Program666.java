import java.util.Scanner;
import java.io.*;

class Program666
{

    public static void main(String[] args) 
    {  
        
        FileReader frobj=null;
        try
        {

          frobj=  new FileReader("Demo.txt");
          System.out.println(frobj.read());
          frobj.close();

            
        }
        catch(IOException iobj)
        {
            System.out.println(iobj);
        }


        finally
        {


        }
    }

}