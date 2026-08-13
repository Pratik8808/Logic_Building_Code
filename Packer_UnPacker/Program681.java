import java.util.Scanner;
import java.io.*;

class Program680
{

    public static void main(String[] args) throws Exception
    {  
        Scanner sobj=new Scanner(System.in);
        String Fname=null;
        File fobj=null;
        FileInputStream fiobj=null;
        int iRet=0;
       

        System.out.println("Enter File Name");
        Fname=sobj.nextLine();
        
        fobj=new File(Fname);
        fiobj=new FileInputStream(fobj);

      
        byte Buffer[]=new byte[50];
        

        if(fobj.exists())
        {   String str=null;
            while((iRet=fiobj.read(Buffer))!=-1)
            {
                str=new String(Buffer);
                System.out.println(str);
                str=null;
                
            }
                
            
           
        }
        else
        {
            System.out.println("There is no Such Files");
        }
        

        
    }

}