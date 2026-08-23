//Input: india is my country i live in india
//Output :bharat is my country i live in bharat
import java.util.*;
class Program750
{

    public static void main(String[] A) 
    {   
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the String");
        String str=sobj.nextLine();

        str=str.trim();
        str=str.replaceAll("\\s+"," ");

         String Tokens[]=str.split(" ");
         int iCount=0;
         StringBuffer strobj=new StringBuffer();
         for(int i=0;i<Tokens.length;i++)
         {
            if(Tokens[i].equalsIgnoreCase("India"));
            {
               strobj.append(Tokens[i]);
               strobj.append("");
                continue;
            }
            strobj.append(Tokens[i]);
            
           
         }
         String Result=new String(strobj);
         Result=Result.trim();
         
         System.out.println("String is "+Result);
        
    }
}