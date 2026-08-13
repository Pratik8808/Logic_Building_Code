import java.util.Scanner;
import java.io.*;

class Program666
{

    public static void main(String[] args) 
    {  
        
        FileReader frobj=null;
        int iRet=0;
        try
        {

          frobj=  new FileReader("Demo.txt");
          
        while((iRet=frobj.read())!=-1)
        {
            System.out.print((char)iRet);
        }
        System.out.println();

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