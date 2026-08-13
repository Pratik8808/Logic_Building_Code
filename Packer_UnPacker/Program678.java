import java.util.Scanner;
import java.io.*;

class Program671
{

    public static void main(String[] args) throws Exception
    {  
        Scanner sobj=new Scanner(System.in);
        String Fname=null;
        File fobj=null;
        FileInputStream fiobj=null;
       

        System.out.println("Enter File Name");
        Fname=sobj.nextLine();
        
        fobj=new File(Fname);
        fiobj=new FileInputStream(fobj);

      
        byte Arr[]=new byte[50];
        String arr=new String(Arr) ;

        if(fobj.exists())
        {
            fiobj.read(Arr);
            System.out.println(new String(Arr));
            // for(int i=0;i<Arr.length;i++)
            // {
            //     System.out.println((char)Arr[i]);
            // }
            
        }
        else
        {
            System.out.println("There is no Such Files");
        }
        

        
    }

}