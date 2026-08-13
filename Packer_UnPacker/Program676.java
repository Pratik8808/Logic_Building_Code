import java.util.Scanner;
import java.io.*;

class Program671
{

    public static void main(String[] args) throws Exception
    {  
        Scanner sobj=new Scanner(System.in);
        String Fname=null;
        File fobj=null;
        FileOutputStream foobj=null;
       

        System.out.println("Enter File Name");
        Fname=sobj.nextLine();
        
        fobj=new File(Fname);
        foobj=new FileOutputStream(fobj);

        String Data="Marvellous Infosystem";
        byte Arr[]=Data.getBytes();

        if(fobj.exists())
        {
            foobj.write(Arr);
        }
        else
        {
            System.out.println("There is no Such Files");
        }
        

        
    }

}