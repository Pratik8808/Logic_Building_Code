import java.util.Scanner;
import java.io.*;

class Program654
{

    public static void main(String[] args) throws IOException
    {
        try
        {
            File fobj=new File("Demo.txt");
            fobj.createNewFile();
            
        }
        catch(IOException iobj)
        {
            System.out.println(iobj);
        }
        catch(Exception eobj)
        {
            System.out.println(eobj);
        }


    }

}