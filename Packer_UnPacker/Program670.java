import java.util.Scanner;
import java.io.*;

class Program669
{

    public static void main(String[] args) 
    {  
        
        FileReader frobj=null;
        int iRet=0;
        char Buffer[] =new char[20];
        try
        {

          frobj=  new FileReader("Demo.txt");
          frobj.read(Buffer,3,12);

          System.out.println(Buffer);
            
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