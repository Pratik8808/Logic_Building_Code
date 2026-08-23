//Input: My name is amit
//Output : ym enam si tima
import java.util.*;
class Program742
{

    public static void main(String[] A) 
    {   
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the String");
        String str=sobj.nextLine();

        str=str.trim();
        str=str.replaceAll("\\s+"," ");

         String Tokens[]=str.split(" ");
         StringBuffer sb=null;
         for(int i=0;i<Tokens.length;i++)
         {
            sb=new StringBuffer();
            sb.append(Tokens[i]);
            System.out.println(sb.reverse());
            // sb.reverse();
            // Tokens[i]=sb.toString();
         }
      
         
       

   

    }
}