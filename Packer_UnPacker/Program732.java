import java.io.*;
import java.util.*;

class program726
{
    public static void main(String A[]) throws Exception
    {
      Scanner sobj=new Scanner(System.in);
      String PackFileName=null;
      File fpackobj=null;
      FileInputStream fiobj=null;
      FileOutputStream foobj=null;

      byte Buffer[]=null;
      
      int iRet=0;
      
      byte header[]=new byte[100];
      String strHeader=null;

      String Token[]=null;
      File newFile=null;
      



      System.out.println("Enter the Name if Packed File");
     
      PackFileName=sobj.nextLine();
      
      fpackobj=new File(PackFileName);
      
     


      if(fpackobj.exists())
      {
         fiobj=new FileInputStream(fpackobj);

         //Read HEader
         fiobj.read(header,0,100);
         strHeader=new String(header);

         strHeader=strHeader.trim();
         strHeader=strHeader.replaceAll("\\s", " ");

         Token=strHeader.split(" ");

         System.out.println("file Name is "+Token[0]);
         System.out.println(""+Token[1]);

         newFile=new File(Token[0]);
         newFile.createNewFile();

         foobj=new FileOutputStream(newFile);
         Buffer=new byte[Integer.parseInt(Token[1])];

         fiobj.read(Buffer,0,Integer.parseInt(Token[1]));
         foobj.write(Buffer,0,Integer.parseInt(Token[1]));



      }
      else
      {
         System.out.println("There is no Such Pack File");
      }

         
   } 
}