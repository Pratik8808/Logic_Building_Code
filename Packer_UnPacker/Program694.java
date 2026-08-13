import java.io.*;
import java.nio.Buffer;
import java.util.*;

class program692
{
    public static void main(String A[]) throws Exception
    {
       Scanner sobj = new Scanner(System.in);
       String FolderName = null;
       String PackFileName=null;

       FileOutputStream foobj=null;
       FileInputStream fiobj=null;
       int iRet=0;
       

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
        foobj=new FileOutputStream(fobjPack,true);
       

         File fArr[]=fobjFolder.listFiles();


         System.out.println("Numbers of file in folder : "+fArr.length);
         byte Buffer[]=new byte[50];
         for(int i=0;i<fArr.length;i++)
         {
            fiobj=new FileInputStream(fArr[i]);
            System.out.println(fArr[i].getName());

            // LOOP to read from fiobj and write to foobj

            // Loop to read from    fobj &w writeto foobj
            while((iRet=fiobj.read(Buffer))!=-1)
            {
               foobj.write(Buffer,0,iRet);


            }
            fiobj.close();
            sobj.close();

         }
         fiobj.close();  
         
         
       }
       else
       {
          System.out.println("There is no such folder");
       }

    }
}