import java.util.Scanner;
import java.io.*;

class Program658
{

    public static void main(String[] args) throws IOException
    {
        try
        {
            File fobj=new File("Demo.txt");

            if(fobj.exists())
            {
                System.out.println("File Already Present");
            }
            else
            {
                fobj.createNewFile();
                System.out.println("File get Sucessfully  Created");
            }
            
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