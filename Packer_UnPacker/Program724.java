import java.io.*;

import java.util.*;

class program724
{
    public static void main(String A[]) throws Exception
    {
       Scanner sobj = new Scanner(System.in);
       String FolderName = null;
       String PackFileName=null;

       FileOutputStream foobj=null; // PackFile File sathi write karnya sathi
       FileInputStream fiobj=null;
       int iRet=0;
       String Header="";
       

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

         foobj=new FileOutputStream(fobjPack);// Now in  it write in packfile
       

         File fArr[]=fobjFolder.listFiles();


         System.out.println("Numbers of file in folder : "+fArr.length);
         byte Buffer[]=new byte[1024];
         for(int i=0;i<fArr.length;i++)
         {
            fiobj=new FileInputStream(fArr[i]);
           
            // Write file name 
            
          
            Header=Header+" "+fArr[i].getName();
            Header=Header+" ";
            Header=Header+" "+fArr[i].length();

            System.out.println(Header);
            // while((iRet=fiobj.read(Buffer))!=-1)
            // {
            //    foobj.write(Buffer,0,iRet);


            // }
            fiobj.close();

            Header="";

         }
         fiobj.close();  
           sobj.close();
         
       }
       else
       {
          System.out.println("There is no such folder");
       }

    }
}