import java.util.Scanner;
import java.io.*;

class Program662
{

    public static void main(String[] args) throws IOException
    {  Scanner sc=new Scanner(System.in);
        File fobj=null;
        boolean bRet=false;
        String Fname=null;

        System.out.println("Enter the File Name");
        Fname=sc.nextLine();
        try
        {
            fobj=new File(Fname);
          
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