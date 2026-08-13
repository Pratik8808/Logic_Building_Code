import java.util.Scanner;
import java.io.*;

class Program671
{

    public static void main(String[] args) 
    {  
        Scanner sobj=new Scanner(System.in);
        String Fname=null;
        File fobj=null;

        System.out.println("Enter File Name");
        Fname=sobj.nextLine();
        
        fobj=new File(Fname);

        if(fobj.exists())
        {
            System.out.println("File name :"+fobj.getName());
            System.out.println("Absolute path is "+fobj.getAbsolutePath());
            System.out.println("File Size :"+fobj.length());
        }
        else
        {
            System.out.println("There is no Such Files");
        }
        

        
    }

}