import java.io.*;
import java.util.*;

class program733
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

          //Read HEader Name
       while((iRet=fiobj.read(header,0,100))!=-1){

          strHeader=new String(header);
         
         //  strHeader=strHeader.trim();
        
         // strHeader=strHeader.replaceAll("\\s", " ");// Extra space replaced single space

          Token=strHeader.split("\\$"); //Remember $ or any special direct given to String 
          // spilt method will create issue because every speical is consider as regex and spilt take single symbol as $  and //$

          System.out.println("This is header of file :   "+strHeader);
          System.out.println("This token length :"+Token.length);

          System.out.println("file Name is "+Token[0]);
          System.out.println("file size is "+Token[1]);
      
          
          newFile=new File(Token[0]);// Object creation
          newFile.createNewFile();
          
          foobj=new FileOutputStream(newFile);
          Buffer=new byte[Integer.parseInt(Token[1])];
          
          fiobj.read(Buffer,iRet,Integer.parseInt(Token[1]));
          foobj.write(Buffer,0,Integer.parseInt(Token[1]));
          
         }


      }
      else
      {
         System.out.println("There is no Such Pack File");
      }

         
   } 
}