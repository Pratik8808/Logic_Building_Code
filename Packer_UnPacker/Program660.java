import java.util.Scanner;
import java.io.*;

class Program660
{

    public static void main(String[] args) throws IOException
    {  
        File fobj=null;
        boolean bRet=false;
        try
        {
            fobj=new File("Demo.txt");
          
            bRet=fobj.exists();
            if(bRet ==true)
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