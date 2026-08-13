import java.util.Scanner;
import java.io.*;

class Program684
{

    public static void main(String[] args) throws Exception
    {  
        String FnameSrc=null;
        String FnameDest=null;
        Scanner sobj=new Scanner(System.in);
        String Fname=null;
    
        File fobj=null;
        
        int iRet=0;
       
        File fobjSrc=null;
        File fobjDest=null;

       
   
        

        System.out.println("Enter Source File Name ");
        Fname=sobj.nextLine();

        System.out.println("Enter Destination File Name");
        FnameDest=sobj.nextLine();






 
        
        fobjSrc=new File(FnameSrc);
        fobjDest=new File(FnameDest);
        fobjDest=new File(FnameDest);

        FileInputStream fiobj=new FileInputStream(fobjSrc);
        FileOutputStream foobj=new FileOutputStream(fobjDest);
        
        

      
        byte Buffer[]=new byte[50];
        

        if(fobjSrc.exists())
        {   String str=null;
            while((iRet=fiobj.read(Buffer))!=-1)
            {
               foobj.write(Buffer,0,iRet);
                
            }
                
            
           
        }
        else
        {
            System.out.println("There is no Such Files");
        }
        

        
    }

}