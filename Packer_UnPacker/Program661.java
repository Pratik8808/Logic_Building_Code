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
               fobj.delete();
               System.out.println("Files get Deleted ");
            }
            else
            {
                
                System.out.println("There is no Such File\n");
                
            }
            
        }
       
        catch(Exception eobj)
        {
            System.out.println(eobj);
        }
        


    }

}