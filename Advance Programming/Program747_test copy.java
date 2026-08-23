//Input: My name is amit
//Output : ym enam si tima
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
         StringBuffer sb=null;
         StringBuffer finalstr=new StringBuffer();
         for(int i=0;i<Tokens.length;i++)
         {
            sb=new StringBuffer();
            sb.append(Tokens[i]);
            sb.reverse();
            finalstr=finalstr.append(sb);
            finalstr=finalstr.append(" ");
         }

       

        System.out.println("Reverse of String is :"+new String(finalstr));

    }
}