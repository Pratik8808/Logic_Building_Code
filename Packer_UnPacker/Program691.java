import java.io.*;
import java.util.*;

class program689
{
    public static void main(String A[]) throws Exception
    {
       Scanner sobj = new Scanner(System.in);
       String FolderName = null;
       String PackFileName=null;

       FileOutputStream foobj=null;
       FileInputStream fiobj=null;

       System.out.println("Enter Folder name : ");
       FolderName = sobj.nextLine();

      System.out.println("Enter the Name of Packed File  : ");
       PackFileName = sobj.nextLine();

       File fobjFolder = new File(FolderName);

       if((fobjFolder.exists()) && (fobjFolder.isDirectory()))
       {
         System.out.println("Folder exists");
         File fobjPack=new File(PackFileName);
         fobjPack.createNewFile(); /// PackFile  Get Created 

         foobj=new FileOutputStream(fobjPack);

         File fArr[]=fobjFolder.listFiles();


         System.out.println("Numbers of file in folder : "+fArr.length);

         for(int i=0;i<fArr.length;i++)
         {
            fiobj=new FileInputStream(fArr[i]);
            // LOOP to read from fiobj and write to foobj

         }
       }
       else
       {
          System.out.println("There is no such folder");
       }

    }
}