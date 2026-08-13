import java.util.Scanner;
import java.io.*;

class Program671
{

    public static void main(String[] args) 
    {  
        Scanner sobj=new Scanner(System.in);
        String Fname=null;
        File fobj=null;
        FileOutputStream fobbj=null;
       

        System.out.println("Enter File Name");
        Fname=sobj.nextLine();
        
        fobj=new File(Fname);
        fobbj=new FileOutputStream(fobj);

        String Data="Marvellous Infosystem";

        if(fobj.exists())
        {
            foobj.write(Data);//Error
        }
        else
        {
            System.out.println("There is no Such Files");
        }
        

        
    }

}