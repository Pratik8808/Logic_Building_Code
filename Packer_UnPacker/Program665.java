import java.util.Scanner;
import java.io.*;

class Program665
{

    public static void main(String[] args) 
    {  
        
        FileWriter fwobj=null;
        try
        {

          fwobj=  new FileWriter("Demo.txt");
            
            fwobj.write("jay Ganesh...");

            fwobj.close();
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