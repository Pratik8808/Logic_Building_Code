import java.io.*;

import java.util.*;

class program726
{
    public static void main(String A[]) throws Exception
    {
       Scanner sobj = new Scanner(System.in);
       String FolderName = null;
       String PackFileName=null;

       FileOutputStream foobj=null;
       FileInputStream fiobj=null;
       byte buffer[]=new byte[1024];
       byte Bheader[]=null;
       int iRet=0;
       String Header="";
       int Size=0;
       int i=0;
       int j=0;
       

       System.out.println("Enter Folder name : ");
       FolderName = sobj.nextLine();

      System.out.println("Enter the Name of Packed File  : ");
       PackFileName = sobj.nextLine();

       File fobjFolder = new File(FolderName);

       if((fobjFolder.exists()) && (fobjFolder.isDirectory()))
       {
         
         File fobjPack=new File(PackFileName);
         fobjPack.createNewFile(); /// PackFile  Get Created 
        foobj=new FileOutputStream(fobjPack,true);
       

         File fArr[]=fobjFolder.listFiles();


         
         byte Buffer[]=new byte[50];
         for(i=0;i<fArr.length;i++)
         {
            fiobj=new FileInputStream(fArr[i]);
           
            // Write file name 
            
          
            Header=Header+" "+fArr[i].getName();
            Header=Header+" "+fArr[i].length();

         

            Size=100-Header.length();

            for(j=1;j<=Size;j++)
            {
               Header=Header+" ";
            }
            Bheader=Header.getBytes();
            System.out.println(Bheader.length);

           
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