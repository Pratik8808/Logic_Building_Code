import java.util.Scanner;
import java.io.*;

class Program685
{

    public static void main(String[] args) throws Exception
    {  
        
        Scanner sobj=new Scanner(System.in);

        String FolderName=null;
        System.out.println("Enter Folder name");
        FolderName=sobj.nextLine();

        File fobj=new File(FolderName);
        if((fobj.isDirectory()) && (fobj.exists()))
        {   
            File fArr[]=fobj.listFiles();
            
            System.out.println("Folder Exists");
        }
        else 
        {
            System.out.println("There is no Such Folder \n");
        }

        
    }

}