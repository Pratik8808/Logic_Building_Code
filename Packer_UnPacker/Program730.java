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
      
      int iRet=0;
      
      byte header[]=new byte[100];
      String strHeader=null;

      String Token[]=null;
      



      System.out.println("Enter the Name if Packed File");
     
      PackFileName=sobj.nextLine();
      
      fpackobj=new File(PackFileName);
      
     


      if(fpackobj.exists())
      {
         fiobj=new FileInputStream(fpackobj);
         fiobj.read(header,0,100);
         strHeader=new String(header);

         strHeader=strHeader.trim();
         strHeader=strHeader.replaceAll("\\s", " ");

         Token=strHeader.split(" ");

         System.out.println("file Name is "+Token[0]);
         System.out.println("");
      }
      else
      {
         System.out.println("There is no Such Pack File");
      }

         
   } 
}