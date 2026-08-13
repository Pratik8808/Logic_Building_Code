import java.util.Scanner;
import java.io.*;

class Program679
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
        

        if(fobj.exists())
        {
            fiobj.read(Arr);
            String str=new String(Arr) ;
            System.out.println(str);
           
        }
        else
        {
            System.out.println("There is no Such Files");
        }
        

        
    }

}