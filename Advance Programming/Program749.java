//Input: My name is amit school name is abhinav and city name is pune 
//Output :3
import java.util.*;
class Program746
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
         for(int i=0;i<Tokens.length;i++)
         {
            if(Tokens[i].equalsIgnoreCase("name"))
            {
                iCount++;
            }   
         }
         System.out.println("Count is  "+iCount);

    }
}